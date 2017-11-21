package com.group1.quizgen.daoimpl;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Option;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.Quiz;
import com.group1.quizgen.util.Constants;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
@Transactional
public class QuizDaoImpl extends BaseDaoImpl implements QuizDao {

    private List<Option> findOptionsByQuestionId(Integer questionId) {
        return entityManager.createQuery("select c from Option c where c.questionID=:q").
                setParameter("q", questionId).
                getResultList();
    }

    @Override
    public List<Chapter> findAllChapter() {
        return entityManager.createQuery("select c from Chapter c").getResultList();
    }

    @Override
    public Chapter findChapterById(Integer chapterID) {
        return entityManager.find(Chapter.class, chapterID);
    }

    @Override
    public Question findQuestionById(Integer questionID) {
        return entityManager.find(Question.class, questionID);
    }

    public Question findNthQuestionOfChapter(Integer chapterID, Integer n) {
        List<Question> l=entityManager.createQuery("select q from Question q where q.chapter.chapterID=:chapterID")
                .setParameter("chapterID", chapterID).setFirstResult(n).setMaxResults(1).getResultList();
        if(l==null || l.isEmpty())
            throw new RuntimeException("Invalid question requested");
        return l.get(0);
    }

    private Question updateQuestionStats(Integer questionID, boolean captured)
    {
        Question q=findQuestionById(questionID);
        if(q.getTimesTaken()==null)
            q.setTimesTaken(0);
        if(q.getTimesCaptured()==null)
            q.setTimesCaptured(0);
        if(captured)
            q.setTimesCaptured(q.getTimesCaptured()+1);
        q.setTimesTaken(q.getTimesTaken()+1);
        entityManager.merge(q);
        return q;
    }

    @Override
    public List<Question> generateRandomQuestionSet(List<Integer> chapterIds, int numQuestions)
    {
        List<Question> result=new ArrayList<>();
        boolean taken[]=new boolean[Constants.MAX_QUESTIONS_PER_CHAPTER];

        for(Integer cId : chapterIds) {

            Chapter chapter=findChapterById(cId);

            if(chapter.getNumQuestions()<numQuestions)
                throw new RuntimeException("Chapter "+cId+" has fewer questions than requested");
            for(int i=0;i<numQuestions;i++) {
                Integer randomSequence;
                do {
                    randomSequence = new Random().nextInt(chapter.getNumQuestions());
                } while (taken[randomSequence] == true);
                taken[randomSequence] = true;

                Question q = findNthQuestionOfChapter(cId, randomSequence);

                result.add(q);
            }
        }

        return result;
    }

    @Override
    public Quiz findQuizById(String quizID) {
        return entityManager.find(Quiz.class, quizID);
    }

    @Override
    public Quiz addQuiz(Quiz quiz) {
        quiz.populateQuestionByte();
        entityManager.persist(quiz);

        List<Question> tmpQ=new ArrayList<>();
        for(Question question : quiz.getQuestionSet())
        {
            boolean captured=false;
            for(Option option : findOptionsByQuestionId(question.getQuestionID()))
            {
                if(option.getIsCorrect()&&option.getAnswerID()==question.getUserAnswerID())
                {
                    captured=true;
                    break;
                }

            }
            tmpQ.add(updateQuestionStats(question.getQuestionID(), captured));
        }
        quiz.setQuestionSet(tmpQ);
        return quiz;
    }

    @Override
    public boolean doesQuizExist(String quizParam) {
        String hql = "FROM Quiz as quiz WHERE quiz.quizParam = ?";
        int count = entityManager.createQuery(hql).setParameter(1, quizParam)
                .getResultList().size();
        return count > 0 ? true : false;
    }
}

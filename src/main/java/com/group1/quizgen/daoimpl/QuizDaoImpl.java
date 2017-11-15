package com.group1.quizgen.daoimpl;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.Quiz;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuizDaoImpl extends BaseDaoImpl implements QuizDao {

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

    @Override
    public List<Question> generateRandomQuestionSet(List<Integer> chapterIds, int numQuestions)
    {
        List<Question> result=new ArrayList<>();

        for(Integer cId : chapterIds) {

            Chapter chapter=findChapterById(cId);

            if(chapter.getNumQuestions()<numQuestions)
                throw new RuntimeException("Chapter "+cId+" has fewer questions than requested");

            Integer randomSequence=new Random().nextInt(numQuestions)+1;
            Question q=findNthQuestionOfChapter(cId,randomSequence);

            result.add(q);
        }

        return result;
    }

    @Override
    public Quiz findQuizById(String quizID) {
        return entityManager.find(Quiz.class, quizID);
    }

    @Override
    public boolean addQuiz(Quiz quiz) {
        entityManager.persist(quiz);
        return true;
    }

    @Override
    public boolean updateQuiz(Quiz quiz) {
        Quiz o=findQuizById(quiz.getQuizID());
        o.setQuizStats(quiz.getQuizStats());
        entityManager.flush();
        return true;
    }

    @Override
    public boolean doesQuizExist(String quizParam) {
        String hql = "FROM Quiz as quiz WHERE quiz.quizParam = ?";
        int count = entityManager.createQuery(hql).setParameter(1, quizParam)
                .getResultList().size();
        return count > 0 ? true : false;
    }
}

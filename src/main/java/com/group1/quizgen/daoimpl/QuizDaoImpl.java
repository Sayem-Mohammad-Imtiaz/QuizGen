package com.group1.quizgen.daoimpl;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.Quiz;
import org.springframework.stereotype.Repository;

@Repository
public class QuizDaoImpl extends BaseDaoImpl implements QuizDao {

    @Override
    public Chapter findChapterById(String chapterID) {
        return entityManager.find(Chapter.class, chapterID);
    }

    @Override
    public Question findQuestionById(String questionID) {
        return entityManager.find(Question.class, questionID);
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

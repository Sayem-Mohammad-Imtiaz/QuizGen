package com.group1.quizgen.dao;

import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.Quiz;

import javax.transaction.Transactional;

@Transactional
public interface QuizDao {
    Chapter findChapterById(String chapterID);
    Question findQuestionById(String questionID);
    Quiz findQuizById(String quizID);
    boolean addQuiz(Quiz quiz);
    boolean updateQuiz(Quiz quiz);
    boolean doesQuizExist(String quizParam);
}

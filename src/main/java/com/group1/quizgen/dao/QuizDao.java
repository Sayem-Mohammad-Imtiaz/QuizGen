package com.group1.quizgen.dao;

import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.Quiz;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface QuizDao {
    List<Chapter> findAllChapter();
    Chapter findChapterById(Integer chapterID);
    Question findQuestionById(Integer questionID);
    Quiz findQuizById(String quizID);
    boolean addQuiz(Quiz quiz);
    boolean updateQuiz(Quiz quiz);
    boolean doesQuizExist(String quizParam);
    List<Question> generateRandomQuestionSet(List<Integer> chapterIds, int numQuestions);
}

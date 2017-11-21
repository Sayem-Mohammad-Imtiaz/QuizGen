package com.group1.quizgen.dao;

import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.Quiz;

import javax.transaction.Transactional;
import java.util.List;

public interface QuizDao {
    List<Chapter> findAllChapter();
    Chapter findChapterById(Integer chapterID);
    Question findQuestionById(Integer questionID);
    Quiz findQuizById(String quizID);
    Quiz addQuiz(Quiz quiz);
    boolean doesQuizExist(String quizParam);
    List<Question> generateRandomQuestionSet(List<Integer> chapterIds, int numQuestions);
}

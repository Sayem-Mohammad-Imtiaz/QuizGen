package com.group1.quizgen.model;

import java.util.List;

public class QuizParam {
    private List<Integer> chapterIds;
    private Integer numQuestions;
    private Integer quizNum;

    public Integer getQuizNum() {
        return quizNum;
    }
    public void setQuizNum(Integer quizNum) {
        this.quizNum = quizNum;
    }
    public List<Integer> getChapterIds() {
        return chapterIds;
    }

    public void setChapterIds(List<Integer> chapterIds) {
        this.chapterIds = chapterIds;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }
}

package com.group1.quizgen.model;

import java.util.List;

public class QuizParam {
    private List<Integer> chapterIds;
    private Integer numQuestions;

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

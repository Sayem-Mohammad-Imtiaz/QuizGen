package com.group1.quizgen.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Chapters")
public class Chapter {
    @Id
    @Column(name = "chapter_ID")
    private String chapterID;
    @Column(name = "number_questions")
    private Integer numQuestions;

    public String getChapterID() {
        return chapterID;
    }

    public void setChapterID(String chapterID) {
        this.chapterID = chapterID;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }
}

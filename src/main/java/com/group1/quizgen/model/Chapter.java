package com.group1.quizgen.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Chapters")
public class Chapter {
    @Id
    @Column(name = "chapter_ID")
    private Integer chapterID;
    @Column(name = "number_questions")
    private Integer numQuestions;

    public Integer getChapterID() {
        return chapterID;
    }

    public void setChapterID(Integer chapterID) {
        this.chapterID = chapterID;
    }
    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }
}

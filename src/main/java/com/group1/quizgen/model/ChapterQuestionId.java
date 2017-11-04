package com.group1.quizgen.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ChapterQuestionId implements Serializable {
    @Column(name = "chapter_ID")
    private String chapterID;
    @Column(name = "question_ID")
    private String questionID;

    public String getChapterID() {
        return chapterID;
    }

    public void setChapterID(String chapterID) {
        this.chapterID = chapterID;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }
}

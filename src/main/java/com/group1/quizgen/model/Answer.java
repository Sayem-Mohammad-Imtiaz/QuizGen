package com.group1.quizgen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Answers")
public class Answer {
    @Id
    @Column(name="answer_ID")
    private String answerID;

    @Column(name="answer_text")
    private String answerText;

    @Column(name = "fixed_slot")
    private Integer fixedSlot;

    @Column(name = "is_correct")
    private boolean isCorrect;

    public String getAnswerID() {
        return answerID;
    }

    public void setAnswerID(String answerID) {
        this.answerID = answerID;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Integer getFixedSlot() {
        return fixedSlot;
    }

    public void setFixedSlot(Integer fixedSlot) {
        this.fixedSlot = fixedSlot;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}

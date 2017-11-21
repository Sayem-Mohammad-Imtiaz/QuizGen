package com.group1.quizgen.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Answers")
public class Option implements Serializable {
    @Id
    @Column(name="answer_ID")
    private Integer answerID;

    @Column(name="answer_text")
    private String answerText;

    @Column(name = "fixed_slot")
    private Integer fixedSlot;

    @Column(name = "is_correct", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isCorrect;

    @Column(name="question_ID")
    private Integer questionID;

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public Integer getAnswerID() {
        return answerID;
    }

    public void setAnswerID(Integer answerID) {
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

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean correct) {
        isCorrect = correct;
    }
}

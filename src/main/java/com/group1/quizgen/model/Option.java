package com.group1.quizgen.model;

import javax.persistence.*;

@Entity
@Table(name = "Answers")
public class Option {
    @Id
    @Column(name="answer_ID")
    private String answerID;

    @Column(name="answer_text")
    private String answerText;

    @Column(name = "fixed_slot")
    private Integer fixedSlot;

    @Column(name = "is_correct")
    private boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "question_ID")
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

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

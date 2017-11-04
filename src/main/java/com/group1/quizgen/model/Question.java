package com.group1.quizgen.model;

import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Question {
    @Id
    @Column(name="question_ID")
    private String questionID;

    @Column(name="question_text")
    private String questionText;

    @Column(name = "number_choices")
    private Integer numberChoices;

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Integer getNumberChoices() {
        return numberChoices;
    }

    public void setNumberChoices(Integer numberChoices) {
        this.numberChoices = numberChoices;
    }
}

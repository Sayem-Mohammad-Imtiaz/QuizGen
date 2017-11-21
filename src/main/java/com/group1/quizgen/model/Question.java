package com.group1.quizgen.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Questions")
public class Question implements Serializable {
    @Id
    @Column(name="question_ID")
    private Integer questionID;

    @Column(name="question_text")
    private String questionText;

    @Column(name = "number_choices")
    private Integer numberChoices;

    @OneToMany
    @JoinColumn(name = "question_ID")
    private List<Option> options;

    @ManyToOne
    @JoinColumn(name = "chapter_ID")
    private Chapter chapter;

    @Column(name="times_taken")
    private Integer timesTaken;

    @Column(name="times_captured")
    private Integer timesCaptured;

    @Transient
    private Integer userAnswerID;

    public Integer getTimesTaken() {
        return timesTaken;
    }

    public Integer getUserAnswerID() {
        return userAnswerID;
    }

    public void setUserAnswerID(Integer userAnswerID) {
        this.userAnswerID = userAnswerID;
    }

    public void setTimesTaken(Integer timesTaken) {
        this.timesTaken = timesTaken;
    }

    public Integer getTimesCaptured() {
        return timesCaptured;
    }

    public void setTimesCaptured(Integer timesCaptured) {
        this.timesCaptured = timesCaptured;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
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

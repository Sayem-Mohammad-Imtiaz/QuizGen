package com.group1.quizgen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quizzes")
public class Quiz {
    @Id
    @Column(name="quiz_ID")
    private String quizID;

    @Column(name="quiz_param")
    private String quizParam;

    @Column(name="quiz_stats")
    private String quizStats;

    public String getQuizID() {
        return quizID;
    }

    public void setQuizID(String quizID) {
        this.quizID = quizID;
    }

    public String getQuizParam() {
        return quizParam;
    }

    public void setQuizParam(String quizParam) {
        this.quizParam = quizParam;
    }

    public String getQuizStats() {
        return quizStats;
    }

    public void setQuizStats(String quizStats) {
        this.quizStats = quizStats;
    }
}

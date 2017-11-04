package com.group1.quizgen.model;

import javax.persistence.*;

@Entity
@Table(name = "Questions_Answers")
public class QuestionAnswer {
    @EmbeddedId
    private QuestionAnswerId questionAnswerId;

    public QuestionAnswerId getQuestionAnswerId() {
        return questionAnswerId;
    }

    public void setQuestionAnswerId(QuestionAnswerId questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
    }
}

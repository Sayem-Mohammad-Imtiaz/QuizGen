package com.group1.quizgen.model;

import org.springframework.util.SerializationUtils;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Quizzes")
public class Quiz {
    @Id
    @Column(name="quiz_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer quizID;

    @Column(name="quiz_param")
    private String quizParam;

    @Transient
    private List<Question> questionSet;

    @Transient
    private List<QuizAnswer> quizAnswers;

    @Column(name="questions")
    private byte[] questionsByte;

    public Integer getQuizID() {
        return quizID;
    }

    public void setQuizID(Integer quizID) {
        this.quizID = quizID;
    }

    public String getQuizParam() {
        return quizParam;
    }

    public void setQuizParam(String quizParam) {
        this.quizParam = quizParam;
    }

    public List<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(List<Question> questionSet) {
        this.questionSet = questionSet;
    }

    public byte[] getQuestionsByte() {
        return questionsByte;
    }

    public void setQuestionsByte(byte[] questionsByte) {
        this.questionsByte = questionsByte;
    }

    public List<QuizAnswer> getQuizAnswers() {
        return quizAnswers;
    }

    public void setQuizAnswers(List<QuizAnswer> quizAnswers) {
        this.quizAnswers = quizAnswers;
    }

    public String computeQuizParam(QuizParam quizParam)
    {
        String q="";
        for(Integer i : quizParam.getChapterIds())
        {
            q+=i+"&";
        }
        q+=quizParam.getNumQuestions();
        return q;
    }

    public void populateQuestionSet()
    {
        if(getQuestionSet()==null || getQuestionSet().isEmpty())
            this.setQuestionSet((List<Question>) SerializationUtils.deserialize(this.getQuestionsByte()));
    }

    public void populateQuestionByte()
    {
        if(getQuestionsByte()==null || getQuestionsByte().length==0)
            this.setQuestionsByte(SerializationUtils.serialize(getQuestionSet()));
    }
}

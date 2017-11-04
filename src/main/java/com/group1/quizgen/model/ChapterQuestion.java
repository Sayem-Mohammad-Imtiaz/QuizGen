package com.group1.quizgen.model;

import javax.persistence.*;

@Entity
@Table(name = "Chapters_Questions")
public class ChapterQuestion {
    @EmbeddedId
    private ChapterQuestionId chapterQuestionId;

    public ChapterQuestionId getChapterQuestionId() {
        return chapterQuestionId;
    }

    public void setChapterQuestionId(ChapterQuestionId chapterQuestionId) {
        this.chapterQuestionId = chapterQuestionId;
    }
}

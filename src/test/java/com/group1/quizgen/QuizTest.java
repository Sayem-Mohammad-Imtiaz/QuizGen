package com.group1.quizgen;

import com.group1.quizgen.model.Chapter;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QuizTest extends QuizGenApplicationTests {

    @Test
    public void chapterShouldReturnChapters()
    {
        assertThat(this.testRestTemplate.getForEntity("http://localhost:" + this.localServerPort
                + "/quizgen/rest/quiz/chapter/", Chapter[].class).getBody()).isNotNull();
    }
}

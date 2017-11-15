package com.group1.quizgen;

import com.group1.quizgen.model.Chapter;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.QuizParam;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class QuizTest extends QuizGenApplicationTests {

    @Test
    public void chapterShouldReturnChapters()
    {
        assertThat(this.testRestTemplate.getForEntity("http://localhost:" + this.localServerPort
                + "/quizgen/rest/quiz/chapter/", Chapter[].class).getBody()).isNotNull();
    }

    @Test
    public void generateQuestionForQuiz()
    {
        Map<String, Object> vars = new HashMap<String, Object>();

        QuizParam qp=new QuizParam();
        List<Integer> ci= Arrays.asList(1,3);
        qp.setChapterIds(ci);
        qp.setNumQuestions(2);

        vars.put("quizParam", qp);

        assertThat(this.testRestTemplate.getForEntity("http://localhost:" + this.localServerPort
                + "/quizgen/rest/quiz/",Question[].class, vars).getBody()).isNotNull();
    }
}

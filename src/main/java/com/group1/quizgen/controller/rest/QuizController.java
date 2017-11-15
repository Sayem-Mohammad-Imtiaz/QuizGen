package com.group1.quizgen.controller.rest;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.QuizParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/quiz/")
public class QuizController {

    @Autowired
    private QuizDao quizDao;

    @GetMapping("/")
    public ResponseEntity<Object> generateQuiz(@RequestBody QuizParam quizParam)
    {
        try
        {
            return new ResponseEntity<>(quizDao.generateRandomQuestionSet(quizParam.getChapterIds(), quizParam.getNumQuestions()), HttpStatus.OK);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("chapter")
    public ResponseEntity<Object> getChapters()
    {
        try
        {
            return new ResponseEntity<>(quizDao.findAllChapter(), HttpStatus.OK);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

package com.group1.quizgen.controller.rest;

import com.group1.quizgen.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/quiz/")
public class QuizController {

    @Autowired
    private QuizDao quizDao;

    @GetMapping("/")
    public ResponseEntity<Object> generateQuiz()
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

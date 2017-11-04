package com.group1.quizgen.controller.rest;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/quiz/")
public class QuizController {

    @Autowired
    private QuizDao quizDao;

    @GetMapping("/")
    public Quiz getQuiz(@RequestParam Integer questionNo)
    {
        Quiz q=new Quiz();
        q.setQuizID("You have requested "+questionNo+" questions");
        return q;
    }
}

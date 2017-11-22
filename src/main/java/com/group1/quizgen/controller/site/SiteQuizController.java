package com.group1.quizgen.controller.site;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("quiz")
public class SiteQuizController {

    @Autowired
    private QuizDao quizDao;

    @PostMapping("/")
    public String generateQuiz(@ModelAttribute QuizParam quizParam, @ModelAttribute Quiz quiz,
                               Model model)
    {
        try
        {
            quiz.setQuestionSet(
                    quizDao.generateRandomQuestionSet(quizParam.getChapterIds(), quizParam.getNumQuestions()));
            quiz.setQuizParam(quiz.computeQuizParam(quizParam));
            model.addAttribute("quiz", quiz);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            model.addAttribute("errorMessage", ex.getMessage());
        }
        return "quiz";
    }

    @PostMapping("result")
    public String verifyAnswer(@ModelAttribute Quiz quiz,
                               Model model)
    {
        try
        {
            quiz=quizDao.addQuiz(quiz);
            model.addAttribute("quiz",quiz);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            model.addAttribute("errorMessage", ex.getMessage());
        }
        return "stats";
    }
}

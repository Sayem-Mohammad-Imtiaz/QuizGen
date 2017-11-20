package com.group1.quizgen.controller.site;

import com.group1.quizgen.dao.QuizDao;
import com.group1.quizgen.model.Question;
import com.group1.quizgen.model.QuizAnswer;
import com.group1.quizgen.model.QuizAnswers;
import com.group1.quizgen.model.QuizParam;
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
    public String generateQuiz(@ModelAttribute QuizParam quizParam, @ModelAttribute QuizAnswers quizAnswers,
                               Model model)
    {
        try
        {
            model.addAttribute("questionSet",
                    quizDao.generateRandomQuestionSet(quizParam.getChapterIds(), quizParam.getNumQuestions()));
            model.addAttribute("quizAnswers", quizAnswers);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            model.addAttribute("errorMessage", ex.getMessage());
        }
        return "quiz";
    }

    @PostMapping("verify")
    public String verifyAnswer(@ModelAttribute QuizAnswers quizAnswers,
                               Model model)
    {
        try
        {
            model.addAttribute("quizAnswers", quizAnswers);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            model.addAttribute("errorMessage", ex.getMessage());
        }
        return "quiz";
    }
}

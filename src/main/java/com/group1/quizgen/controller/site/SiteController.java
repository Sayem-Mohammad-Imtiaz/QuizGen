package com.group1.quizgen.controller.site;

import com.group1.quizgen.model.QuizParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller("site")
public class SiteController {

    @GetMapping("/")
    public String getIndexPage(@ModelAttribute QuizParam quizParam, Model model)
    {
        model.addAttribute("quizParam", quizParam);
        return "index";
    }

}

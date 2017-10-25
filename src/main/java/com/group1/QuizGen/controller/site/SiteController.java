package com.group1.QuizGen.controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/")
    public String getIndexPage()
    {
        return "index";
    }
}

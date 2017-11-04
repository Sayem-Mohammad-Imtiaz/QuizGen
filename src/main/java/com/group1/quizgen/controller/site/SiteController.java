package com.group1.quizgen.controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("site")
public class SiteController {

    @GetMapping("/")
    public String getIndexPage()
    {
        return "index";
    }

}

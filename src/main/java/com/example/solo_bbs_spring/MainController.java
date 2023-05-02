package com.example.solo_bbs_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 soloㅠ 환영";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
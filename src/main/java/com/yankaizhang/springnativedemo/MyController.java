package com.yankaizhang.springnativedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dzzhyk
 */
@Controller
public class MyController {

    @GetMapping("/")
    public String index(@RequestParam("a") Integer a,
                        @RequestParam("b") Integer b, Model model) {
        model.addAttribute("ans", a + b);
        model.addAttribute("str", "含有html信息: <h1>这是h1标题</h1>");
        model.addAttribute("title", "Welcome to Spring-Native & Thymeleaf Website!");
        return "index";
    }

}

package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/index")
    public String index(){
        return "StartPage";
    }

    @GetMapping("/Recipe")
    public String Recipe(){
        return "Recipe";
    }

}

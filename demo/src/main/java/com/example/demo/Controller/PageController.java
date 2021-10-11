package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String index(){
        return "StartPage";
    }

    @GetMapping("/Recipe")
    public String Recipe(){
        return "Recipe";
    }

    @GetMapping("/Recipe/spaghetti-carbonara")
    public String RecipePt2(){
        return "Recipept2";
    }

    @GetMapping("/Order")
    public String Order(){
        return "Order";
    }

    @GetMapping("/OurVision")
    public String OurVision(){
        return "OurVision";
    }

    @GetMapping("/confirm_order")
    public String confirm_order(){
        return "confirm-order";
    }

    @GetMapping("/order_page")
    public String Order_page(){
        return "Order-page";
    }

}

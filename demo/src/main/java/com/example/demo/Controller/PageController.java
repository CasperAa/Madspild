package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping({"/home", "/", "startside","startpage"})
    public String index(){
        return "StartPage";
    }

    @GetMapping({"/Recipe", "/recipe"})
    public String Recipe(){
        return "Recipe";
    }

    @GetMapping({"/Recipe/spaghetti-carbonara", "/recipe/spaghetti-carbonara"})
    public String RecipePt2(){
        return "Recipept2";
    }

    @GetMapping({"/Order", "/order"})
    public String Order(){
        return "Order";
    }

    @GetMapping({"/OurVision", "/ourvision", "/ourVision", "voresvision", "VoresVision", "Voresvision", "voresVision"})
    public String OurVision(){
        return "OurVision";
    }

    @GetMapping("/confirm_order")
    public String confirm_order(){
        return "confirm-order";
    }

    @GetMapping({"/order_page", "/orderpage", "/OrderPage", "/Order_page", "/Order_Page"})
    public String Order_page(){
        return "Order-page.html";
    }

    @GetMapping("/error")
    public String error(){
        return "Error";
    }

    @GetMapping("/ThanksBuying")
    public String ThanksBuying(){
        return "ThanksBuying";
    }

}

package adventurexpfrontend2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "/userClient/index";
    }

    @GetMapping("/createevent")
    public String createEvent(){
        return "/userClient/createEvent";
    }

    @GetMapping("/profile/about")
    public String profileAbout(){
        return "/userClient/profileAbout";
    }

    @GetMapping("/profile/history")
    public String profileHistory(){
        return"/userClient/profileHistory";
    }

}
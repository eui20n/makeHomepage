package eui20n.makeHomepage.profile2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Profile2Controller {

    @GetMapping("profile2")
    public String profile2Controller(){
        return "/profile2/home";
    }
}

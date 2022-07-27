package eui20n.makeHomepage.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("profile")
    public String profileHome(Model model){
        return "/profile/home";
    }

    @GetMapping("home")
    public String goHome(){
        return "redirect:/";
    }
}

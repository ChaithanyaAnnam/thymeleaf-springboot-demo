package com.java.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/if-unless")
    public String users(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("chaitanya","chaitu.annm@gmail.com","ADMIN"));
        users.add(new User("Anil","anil.G@gmail.com","USER"));
        users.add(new User("lavanya","lavanya.annm@gmail.com","USER"));
        users.add(new User("mokshitha","mokshita.R@gmail.com","ADMIN"));
        model.addAttribute("users",users);
        return "if-unless";
    }

    @GetMapping("/Switch-Case")
    public String switchDemo(Model model){
        User user = new User("chaitanya","chaitu.annm@gmail.com","ADMIN");
        model.addAttribute("user",user);
        return "switch-case";
    }
}

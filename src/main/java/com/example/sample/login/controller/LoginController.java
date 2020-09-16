package com.example.sample.login.controller;

import com.example.sample.login.domain.model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLogin(Model model) {
        model.addAttribute("form", new LoginForm());
        return "login/login";
    }

    @PostMapping("/login")
    public String postLogin(@ModelAttribute("form") LoginForm form, Model model) {
        return "login/login";
    }
}

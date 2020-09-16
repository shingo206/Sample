package com.example.sample.login.controller;

import com.example.sample.login.domain.model.SignupForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
    @GetMapping("/signup")
    public String getSignUp(@ModelAttribute("form") SignupForm form, Model model) {
        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute("form") SignupForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return getSignUp(form, model);
        }
        System.out.println(form);
        return "redirect:/login";
    }
}

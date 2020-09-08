package com.example.sample.trySpring;

import com.example.sample.model.Employee;
import com.example.sample.model.HelloForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public String getHello(Model model) {
        model.addAttribute("form", new HelloForm());
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@ModelAttribute HelloForm form, Model model) {
        model.addAttribute("form", form);
        return "helloResponse";
    }

    @PostMapping("/hello/db")
    public String postDbRequest(@ModelAttribute HelloForm form, Model model) {
        Employee employee = helloService.findOne(form.getId());
        form.setId((int) employee.getId());
        form.setName(employee.getName());
        form.setAge(employee.getAge());
        model.addAttribute("form", form);
        return "helloResponseDB";
    }
}

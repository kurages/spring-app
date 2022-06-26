package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.form.UserForm;

@Controller
@RequestMapping("/user")
public class UserController {
    @ModelAttribute
    private UserForm UserForm(){
        return new UserForm();
    }

    @RequestMapping(value="/fetch")
    public String userFetch(Model model){
        model.addAttribute("form", new UserForm());
        return "user/userForm";
    }

    @RequestMapping(value="/view")
    public String userView(UserForm userForm, Model model){
        return "user/userView";
    }
}

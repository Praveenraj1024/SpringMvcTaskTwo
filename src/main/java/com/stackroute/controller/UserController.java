package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public String display() {
        return "index";
    }

    @RequestMapping("/welcome")
    public ModelAndView display2(@ModelAttribute("userName") String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        User user = new User();
        user.setName(name);
        modelAndView.addObject("userName", user.getName());
        return modelAndView;
    }
}

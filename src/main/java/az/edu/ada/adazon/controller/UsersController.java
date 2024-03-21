package az.edu.ada.adazon.controller;

import az.edu.ada.adazon.entity.User;
import az.edu.ada.adazon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/add")
    public String addUser(){
        return "adduser";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "redirect:/user/add";
    }

    @GetMapping("/list")
    public ModelAndView listUser(){
        List<User> list=userService.listUser();
        return new ModelAndView("users", "user", list);
    }

}
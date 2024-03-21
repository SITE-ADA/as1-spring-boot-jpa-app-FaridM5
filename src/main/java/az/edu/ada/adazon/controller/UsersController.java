package az.edu.ada.adazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {
    @GetMapping("/add")
    public String addUser(){
        return "adduser";
    }
}

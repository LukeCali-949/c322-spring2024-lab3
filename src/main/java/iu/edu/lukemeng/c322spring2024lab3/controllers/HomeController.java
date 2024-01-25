package iu.edu.lukemeng.c322spring2024lab3.controllers;

import iu.edu.lukemeng.c322spring2024lab3.model.AnimalData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greetings(){
        return "Welcome to the animal service";
    }


}

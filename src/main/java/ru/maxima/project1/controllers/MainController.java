package ru.maxima.project1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author AramaJava 05.08.2023
 */
@Controller
public class MainController {
    @GetMapping()
    public String index() {
        return "main/index";
    }
}

package org.lessons.java.spring.spring_la_mia_pizzeria_crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @GetMapping
    public String pizzas() {
        return "pizzas/index";
    }

}

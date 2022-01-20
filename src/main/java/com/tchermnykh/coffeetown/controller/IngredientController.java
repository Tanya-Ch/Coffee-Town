package com.tchermnykh.coffeetown.controller;

import com.tchermnykh.coffeetown.repository.SweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private SweetRepository sweetRepository;

    @GetMapping
    public ModelAndView searchSweets(){

        final ModelAndView modelAndView = new ModelAndView("ingredient");
        modelAndView.addObject("ingredients",
                sweetRepository.findAll());

        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView addNewCustomer() {
        ModelAndView modelAndView = new ModelAndView("addNewIngredient");

        return modelAndView;
    }
}

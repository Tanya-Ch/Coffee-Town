package com.tchermnykh.coffeetown.controller;

import com.tchermnykh.coffeetown.repository.SweetRepository;
import com.tchermnykh.coffeetown.service.FirstService;
import com.tchermnykh.coffeetown.service.SweetService;
import com.tchermnykh.coffeetown.dto.SweetDto;
import com.tchermnykh.coffeetown.entity.Sweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/sweet")
public class SweetController {

    @Autowired
//    private SweetService sweetService;
    private SweetRepository sweetRepository;
    private FirstService firstService;
    private SweetDto tempSweetDto = null;

//    public SweetController(SweetService sweetService, FirstService firstService) {
//        this.sweetService = sweetService;
//        this.firstService = firstService;
//    }
//    public SweetController(){
//
//    }

    @GetMapping
    public ModelAndView searchSweets(){

        final ModelAndView modelAndView = new ModelAndView("sweet");
        modelAndView.addObject("sweets",
                sweetRepository.findAll());

        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView addNewCustomer() {
        ModelAndView modelAndView = new ModelAndView("addNewSweet");
//        if (tempSweetDto != null) {
//            modelAndView.addObject("sweet", tempSweetDto);
//            tempSweetDto = null;
//        }
        return modelAndView;
    }

//    @PostMapping("/add")
//    public String addNewSweet(@ModelAttribute SweetDto sweetDto,
//                               final RedirectAttributes redirectAttributes) {
//        List<Sweet> list = sweetRepository.findAll();

//        List<SweetDto> dtoList = list.stream()
//                .map(firstService::fromSweet)
//                .collect(Collectors.toList());
//        boolean contains = dtoList.contains(sweetDto);
//
//        if(contains == true){
//            redirectAttributes.addFlashAttribute("errorMessagePresent", true);
//            redirectAttributes.addFlashAttribute("errorMessage", "This device already exists!");
//            return "redirect:/sweet/add/";
//        }
//        Sweet sweet = firstService.fromSweetDto(sweetDto);
//        sweetRepository.save(sweet);
//
//        redirectAttributes.addFlashAttribute("success", true);
//
//        tempSweetDto = sweetDto;
//
//        return "redirect:/sweet/add/";
//    }
}

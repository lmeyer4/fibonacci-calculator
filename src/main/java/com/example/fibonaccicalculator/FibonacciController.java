package com.example.fibonaccicalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class FibonacciController {


    @Resource
    FibonacciService fibonacciService;

    @GetMapping
    public String showFibonacci(Model model) {
        model.addAttribute("fibonacciIndex", new FibonacciIndex());
        return "fibonacci-calculator";
    }

    @PostMapping
    public String calculateFibonacci(@ModelAttribute FibonacciIndex fibonacciIndex, BindingResult bindingResult, Model model) {

        long fibonacci = fibonacciService.fibonacci(fibonacciIndex.getIndex());

        model.addAttribute("fibonacciNumber", fibonacci);

        return "result";
    }



}

package com.killerexpertise.calculator.controller;

import com.killerexpertise.calculator.model.AddValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    // Show addition page
    @GetMapping("/addpage")
    public String additionPage() {
        System.out.println("Controller in addition.jsp");
        return "AdditionPage";
    }

    @GetMapping("/subpage")
    public String subtractionPage() {
        System.out.println("Controller in Subtraction.jsp");
        return "SubtractionPage";
    }

    @GetMapping("/divpage")
    public String divisionPage() {
        System.out.println("Controller in Division.jsp");
        return "DivisionPage";
    }

    @GetMapping("/multipage")
    public String multiplicationPage() {
        System.out.println("Controller in Multiplication.jsp");
        return "MultiplicationPage";
    }

    @PostMapping("/additionresult")
    public String additionResult(@ModelAttribute AddValue a, Model m) {
        int result = a.getFirstNumber() + a.getSecondNumber();
        addAttributesToModel(a, m, result);
        return "addResult";
    }

    @PostMapping("/subtractionresult")
    public String subtractionResult(@ModelAttribute AddValue a, Model m) {
        int result = a.getFirstNumber() - a.getSecondNumber();
        addAttributesToModel(a, m, result);
        return "subResult";
    }

    @PostMapping("/divisionresult")
    public String divisionResult(@ModelAttribute AddValue a, Model m) {
        if (a.getSecondNumber() == 0) {
            m.addAttribute("error", "Division by zero is not allowed!");
            return "DivisionPage";
        }
        int result = a.getFirstNumber() / a.getSecondNumber();
        addAttributesToModel(a, m, result);
        return "divResult";
    }

    @PostMapping("/multiplicationresult")
    public String multiplicationResult(@ModelAttribute AddValue a, Model m) {
        int result = a.getFirstNumber() * a.getSecondNumber();
        addAttributesToModel(a, m, result);
        return "multiResult";
    }

    private void addAttributesToModel(AddValue a, Model m, int result) {
        m.addAttribute("FirstNumber", a.getFirstNumber());
        m.addAttribute("SecondNumber", a.getSecondNumber());
        m.addAttribute("Result", result);
    }
}

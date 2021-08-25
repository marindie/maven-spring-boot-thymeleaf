package com.unity.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/pay")
@Slf4j
public class PaymentController {
    
    @RequestMapping(value="")
    public String paymentView(@RequestParam Map<String,Object> param, Model model) {
        log.info("=============== payment ================");
        String name = "payment";
        
        model.addAttribute("name",name);
        return "payment";
    }
}

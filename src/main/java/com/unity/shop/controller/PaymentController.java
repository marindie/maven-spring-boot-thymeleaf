package com.unity.shop.controller;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PaymentController {
    
    @RequestMapping(value="/pay")
    public String paymentView(@RequestParam Map<String,Object> param, Model model) {
        log.info("=============== payment ================");
        String name = "payment";
        
        model.addAttribute("name",name);
        return "payment";
    }

    @RequestMapping(value="/pay/confirm", method={RequestMethod.POST}, produces = "application/json")
    public @ResponseBody String paymentComplete(@RequestBody Map<String,Object> param, Model model) {
        Gson gson = new Gson();
        log.info("===== param ==> "+gson.toJson(param));
        Map<String,Object> retMap = new HashMap<String,Object>();
        retMap = param;
        return gson.toJson(retMap);
    }
}

package com.unity.shop.controller;

import java.util.List;
import java.util.Map;

import com.unity.shop.common.Utils;
import com.unity.shop.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="", method={RequestMethod.GET,RequestMethod.POST})
	public String login(@RequestParam Map<String,Object> param, Model model, RedirectAttributes redirectAttrs){
        
        List<Map<String,Object>> user = loginService.getUsers(param);
        if(Utils.isEmpty(user)){
            model.addAttribute("loginResult","fail");
            return "login";
        }else{
            if(user.size() == 1){
                // model.addAttribute("user",user.get(0));
                redirectAttrs.addFlashAttribute("user",user.get(0));
            }else{
                // model.addAttribute("userList",user);
                redirectAttrs.addFlashAttribute("userList",user);
            }
            return "redirect:/main";
        }
	}
}

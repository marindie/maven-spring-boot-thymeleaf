package com.unity.shop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.unity.shop.common.Utils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {

	@RequestMapping(value="/", method={RequestMethod.GET,RequestMethod.POST})
	public String mainView(@RequestParam Map<String,Object> param, Model model) {

		//List<Map<String,Object>> taskList = new ArrayList<Map<String,Object>>();
		List<String> taskList = new ArrayList<String>();
		for (int i = 0 ; i < 10 ; i++) {
			//Map<String,Object> task = new HashMap<String,Object>();	
			//task.put("task","wony"+i);
			taskList.add("wony"+i);
		}

		model.addAttribute("tasks",taskList);
		model.addAttribute("message","wony");
		
		return "login";
	}

	@RequestMapping(value="/main")
	public String main(@RequestParam Map<String,Object> param, Model model) {
		log.info("==============================");
		log.info("============ Main ============");
		if(!Utils.isEmpty(model)){
			log.info(model.getAttribute("user").toString());
		}
		log.info("==============================");
		return "main00001";
	}	

	@RequestMapping(value="/home")
	public String home(@RequestParam Map<String,Object> param, Model model) {
		String home = "안녕하세요 home 입니다.";
		String welcome = "안녕하세요 welcome 입니다.";
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("welcome",home);
		model.addAttribute("home",map);
		model.addAttribute("welcome",welcome);
		return "home";
	}

	@RequestMapping(value="/getName", method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody String getName(@RequestParam Map<String,Object> param, Model model) {
		
		Map<String,Object> retMap = new HashMap<String,Object>();
		Gson gson = new Gson();
		return gson.toJson(retMap);
	}
}

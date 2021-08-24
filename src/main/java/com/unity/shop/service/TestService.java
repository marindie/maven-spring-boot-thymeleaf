package com.unity.shop.service;

import java.util.List;
import java.util.Map;

import com.unity.shop.dao.TestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;
	
	public List<Map<String,Object>> getUser(Map<String,Object> param){
		return testMapper.getUsers(param);
	}
	public Map<String,Object> findUserById(Map<String,Object> param){
		return testMapper.findUserById(param);
	}
}

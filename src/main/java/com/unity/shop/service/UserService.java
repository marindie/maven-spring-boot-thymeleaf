package com.unity.shop.service;

import java.util.Optional;

import com.unity.shop.entity.UserEntity;
import com.unity.shop.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserEntity getUser(String userId){
		Optional<UserEntity> userEntity = userRepository.findById(userId);
		return userEntity.isPresent() ? userEntity.get() : null;
	}
}

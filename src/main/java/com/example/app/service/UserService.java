package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.dto.UserDto;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.repository.UserRepository;
import com.example.app.dto.UserDto;

@Service
public class UserService{
	@Autowired
	UserRepository userRepository;

	public UserDto getUser(String userId){
		List<UserDto> dtoList = userRepository.getUser(userId);
		if(dtoList.isEmpty()){
			return null;
		}
		UserDto dto = dtoList.get(0);
		return dto;
	}
}


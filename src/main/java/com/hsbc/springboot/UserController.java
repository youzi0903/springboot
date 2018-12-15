package com.hsbc.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.springboot.mapper.UserMapper;
import com.hsbc.springboot.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserMapper userMapper;

	@RequestMapping("/allUsers")
	public List<User> retriveAllUsers() {
		return userMapper.findUserInfo();
	}
}

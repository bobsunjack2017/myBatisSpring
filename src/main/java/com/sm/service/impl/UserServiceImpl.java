package com.sm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.mapper.UserMapper;
import com.sm.pojo.User;
import com.sm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired

	private UserMapper userMapper;

	@Override
	public User getUserByUsername(String username) {

		User user = userMapper.selectUser1(username);

		return user;

	}

}

package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.User;

public interface UserService {
	public List<User> findAllUsers();
	public User login(String name, String password);

}

package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.User;

public interface UserDAO {
	public User queryUserById(Integer id);
	public List<User> queryAllUsers();
	public User queryUserByName(@Param("name") String name);

}

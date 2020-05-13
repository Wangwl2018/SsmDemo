package com.baizhi.service.impl;

import java.util.List;

import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.exception.ApplicationException;
import com.baizhi.exception.NameException;
import com.baizhi.exception.PasswordException;
import com.baizhi.exception.SystemException;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	

	public UserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	public List<User> findAllUsers() {
		
		return userDAO.queryAllUsers();
	}


	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	public User login(String name, String password) {
		try{
			User user = userDAO.queryUserByName(name);
			if(true){
				throw new Exception("��������");
			}
			if (user == null){
				throw new NameException("用户名不存在");
			}
			if(!password.equals(user.getPassword())){
				throw new PasswordException("密码不匹配");
			}
			return user;
		}catch(ApplicationException ae){
			ae.printStackTrace();
			throw ae;
		}catch(Exception e){
			e.printStackTrace();
			throw new SystemException("系统存在问题");
		}
		
	}

}

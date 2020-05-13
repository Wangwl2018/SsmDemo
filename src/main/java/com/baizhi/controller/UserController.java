package com.baizhi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/findAllUsers")
	public String findAllUsers(Model model){
		List<User> users = userService.findAllUsers();
		
		for (User user :users)
		{
			System.out.println("user id is"+user.getId()+"user name is "+user.getName());
		}
		model.addAttribute("users", users);
		return "showAllUser";
	}
	
	@RequestMapping("/login")
	public String login(String name,String password){
		User user = userService.login(name, password);
		if (user==null){
			return "loginError";
		}else{
			return "loginOk";
		}
	}

}

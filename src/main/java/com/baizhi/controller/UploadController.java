package com.baizhi.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping("/upload")
	public String upload(MultipartFile uploadFile,HttpSession session) throws Exception{
		ServletContext sc = session.getServletContext();
		String absolutePath = sc.getRealPath("/upload");
		File deskFile = new File(absolutePath+"\\"+uploadFile.getOriginalFilename());
		uploadFile.transferTo(deskFile);
		
		
		return "uploadOk";
		
	}

}

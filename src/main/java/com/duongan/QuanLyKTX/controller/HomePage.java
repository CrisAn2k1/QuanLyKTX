package com.duongan.QuanLyKTX.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.duongan.QuanLyKTX.mapper.PhongMapper;
import com.duongan.QuanLyKTX.mapper.UserMapper;
import com.duongan.QuanLyKTX.model.Phong;
import com.duongan.QuanLyKTX.model.PhongExample;
import com.duongan.QuanLyKTX.model.User;
import com.duongan.QuanLyKTX.model.UserExample;




@Controller
public class HomePage {

	@Autowired
	UserMapper usersMapper;
	@Autowired
	PhongMapper phongMapper;
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		
		
			
		UserExample example2 = new UserExample();
		List<User> listUsers = usersMapper.selectByExample(example2);
		System.out.println("kiem tra" + listUsers.size());
		PhongExample example = new PhongExample(); 
		List<Phong> listPhong = phongMapper.selectByExample(example);
		for (Phong item : listPhong) {
			System.out.println("Phong " + item.getIdPhong() +" có: " + item.getSoluongsv());
		}
		
		
		
		
		return modelAndView;
	}
}

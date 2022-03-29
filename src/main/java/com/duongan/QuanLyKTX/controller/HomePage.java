package com.duongan.QuanLyKTX.controller;
import java.util.List;


import com.duongan.QuanLyKTX.mapper.NoithatMapper;
import com.duongan.QuanLyKTX.model.*;
import com.duongan.QuanLyKTX.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.duongan.QuanLyKTX.mapper.PhongMapper;
import com.duongan.QuanLyKTX.mapper.UserMapper;

@Service
@Controller
public class HomePage {
	@Autowired
	private UserRepository repo;

	@Autowired
	UserMapper usersMapper;
	@Autowired
	PhongMapper phongMapper;
	@Autowired
	NoithatMapper noithatMapper;
	@RequestMapping("/homepage")
	public ModelAndView homepage() {
		ModelAndView modelAndView = new ModelAndView("homepage");

//		UserExample example2 = new UserExample();
//		List<User> listUsers = usersMapper.selectByExample(example2);
//		System.out.println("kiem tra" + listUsers.size());
//		PhongExample example = new PhongExample();
//		List<Phong> listPhong = phongMapper.selectByExample(example);
//		for (Phong item : listPhong) {
//			System.out.println("Phong " + item.getIdPhong() +" c�: " + item.getSoluongsv());
//		}
		NoithatExample noithatExample = new NoithatExample();
		List<Noithat> noithatList = noithatMapper.selectByExample(noithatExample);
		for (Noithat item: noithatList){
			System.out.println("Ma noi that: " +item.getIdNoithat());
		}
		return modelAndView;
	}



	@GetMapping("/login")
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView("login");

		return modelAndView;
	}
	@GetMapping("/login-success")
	public ModelAndView loginsucess(){
		ModelAndView modelAndView = new ModelAndView("login-success");

		return modelAndView;
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

//	@GetMapping("/register")
//	public ModelAndView registerForm(){
//		ModelAndView modelAndView = new ModelAndView("signup_form");
//		return modelAndView;
//	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		repo.save(user);

		return "signup_success";
	}


//	@PostMapping("/process_register")
//	public ModelAndView signupSuccess(User user) {
//
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encodedPassword = passwordEncoder.encode(user.getPassword());
//		user.setPassword(encodedPassword);
//		repo.save(user);
//		ModelAndView modelAndView = new ModelAndView("signup_success");
//		return modelAndView ;
//	}


}

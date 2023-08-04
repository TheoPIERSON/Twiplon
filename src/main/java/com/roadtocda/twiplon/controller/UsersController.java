package com.roadtocda.twiplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.roadtocda.twiplon.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersservice;
	
	
	/*@GetMapping("/Utilisateur")
	public Iterable<Users> getAllUsers(){
		return usersservice.getAllUsers();
	}*/
	
	@GetMapping("/users")
    public String Users(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("AllUsers", usersservice.getAllUsers());
        return "index";
    }
}

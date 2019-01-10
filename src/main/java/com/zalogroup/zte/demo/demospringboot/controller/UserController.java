/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.controller;

import com.zalogroup.zte.demo.demospringboot.entity.User;
import com.zalogroup.zte.demo.demospringboot.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cpu02453-local
 */
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/users")
	@ResponseBody
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
}

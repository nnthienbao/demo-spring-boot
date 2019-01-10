/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.controller;

import com.zalogroup.zte.demo.demospringboot.entity.GirlFriendInfo;
import com.zalogroup.zte.demo.demospringboot.exception.GirlNotFoundException;
import com.zalogroup.zte.demo.demospringboot.repo.GirlFriendRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cpu02453-local
 */
@RestController
public class GirlFriendController {
	
	@Autowired
	private GirlFriendRepository girlFriendRepository;
	
	@GetMapping(value = "/girls")
	@ResponseBody
	public Iterable<GirlFriendInfo> getListGirl() {
		return girlFriendRepository.findAll();
	}
	
	@PostMapping(value = "/girls")
	@ResponseBody
	public GirlFriendInfo createGirl(@RequestBody(required = true) GirlFriendInfo girlFriendInfo) {
		GirlFriendInfo saved = girlFriendRepository.save(girlFriendInfo);
		return saved;
	}
	
	@PutMapping(value = "/girls")
	@ResponseBody
	public GirlFriendInfo updateGirl(@RequestBody(required = true) GirlFriendInfo girlUpdate) {
		Optional<GirlFriendInfo> opGirl = girlFriendRepository.findById(girlUpdate.getId());
		if(opGirl.isPresent()) {
			GirlFriendInfo girl = opGirl.get();
			girl.setName(girlUpdate.getName());
			girl.setAvtUrl(girlUpdate.getAvtUrl());
			GirlFriendInfo girlSaved = girlFriendRepository.save(girlUpdate);
			return girlSaved;
		} else {
			throw new GirlNotFoundException();
		}
	}
	
	@DeleteMapping(value = "/girls/{id}")
	@ResponseBody
	public Map<String, Object> deleteGirl(@PathVariable(name = "id") int id) {
		if(girlFriendRepository.existsById(id)) {
			girlFriendRepository.deleteById(id);
			Map<String, Object> result = new HashMap<>();
			result.put("message", true);
			return result;
		} else {
			throw new GirlNotFoundException();
		}
	}
}

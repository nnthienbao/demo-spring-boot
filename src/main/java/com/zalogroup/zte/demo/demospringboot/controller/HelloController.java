/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author cpu02453-local
 */
@Controller
public class HelloController {
	@GetMapping(value = "hello")
	public String getHello(@RequestParam(value = "name", defaultValue = "every body") String name,
			Map<String, Object> model
			) {
		model.put("name", name);
		return "hello";
	}
}

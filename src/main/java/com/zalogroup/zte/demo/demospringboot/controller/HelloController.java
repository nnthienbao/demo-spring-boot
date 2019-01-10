/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.controller;

import com.zalogroup.zte.demo.demospringboot.entity.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cpu02453-local
 */
@RestController
public class HelloController {
	@GetMapping(value = "hello")
	@ResponseBody
	public Hello getHello(@RequestParam(value = "name", defaultValue = "every body") String name) {
		Hello hello = new Hello();
		hello.setMessage(String.format("Hello %s", name));
		return hello;
	}
}

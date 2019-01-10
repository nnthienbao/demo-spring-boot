/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author cpu02453-local
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Girl not found")
public class GirlNotFoundException extends RuntimeException {
	
}

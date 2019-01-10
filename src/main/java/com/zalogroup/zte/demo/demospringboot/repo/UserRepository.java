/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.repo;

import com.zalogroup.zte.demo.demospringboot.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author thienbao
 */
public interface UserRepository extends CrudRepository<User, Integer>  {
	
}

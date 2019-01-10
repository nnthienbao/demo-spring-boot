/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zalogroup.zte.demo.demospringboot.repo;

import com.zalogroup.zte.demo.demospringboot.entity.GirlFriendInfo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author cpu02453-local
 */
public interface GirlFriendRepository extends CrudRepository<GirlFriendInfo, Integer> {
	
}

package com.tuanvumustache.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tuanvumustache.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel="aliens", path="aliens")
public interface AlienReponsitory extends JpaRepository<Alien, Integer>{
	
}

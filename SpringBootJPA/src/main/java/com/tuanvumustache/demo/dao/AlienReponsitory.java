package com.tuanvumustache.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tuanvumustache.demo.model.Alien;

public interface AlienReponsitory extends CrudRepository<Alien, Integer>{
	// 12. Data JPA | MVC | H2 | Query Methods Example
	List<Alien> findByAname(String aname);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where aname like %?1% order by aname")
	List<Alien> findByAnameSorted(String aname);
	Alien getOne(int aid);
}

package com.PersonJpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.PersonJpa.pojo.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	


}

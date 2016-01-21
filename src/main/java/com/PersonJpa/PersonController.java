package com.PersonJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PersonJpa.dao.PersonRepository;
import com.PersonJpa.pojo.Person;

@Controller
public class PersonController {

	@Autowired
    private PersonRepository personRepository;


    
    @RequestMapping("/get")
    @ResponseBody
    public Iterable<Person> find() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return personRepository.findAll();
        
    }
	
	@RequestMapping("/h")
	@ResponseBody
	String home(){
		return "hellooooo wrld";
	}
}

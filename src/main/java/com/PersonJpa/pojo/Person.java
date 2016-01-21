package com.PersonJpa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Person {

	@Id
    private Long id;

    
    private String firstname;

    
    private String lastname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

}

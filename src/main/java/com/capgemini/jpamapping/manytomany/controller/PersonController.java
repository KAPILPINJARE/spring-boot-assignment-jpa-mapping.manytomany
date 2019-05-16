package com.capgemini.jpamapping.manytomany.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpamapping.manytomany.entity.Person;
import com.capgemini.jpamapping.manytomany.entity.Project;
import com.capgemini.jpamapping.manytomany.service.MyService;

@RestController
public class PersonController {

	@Autowired
	private MyService service;

	@RequestMapping("/MTM")
	public Set<Person> addOneToMany() {

		Set<Project> p1 = new HashSet<Project>();
		p1.add(new Project(101, "bankapp"));
		p1.add(new Project(102, "mobileapp"));

		/*
		 * Set<Project> p2 = new HashSet<Project>(); p2.add(new Project(103, "comp"));
		 * p2.add(new Project(104, "xyz"));
		 */

		Set<Person> person = new HashSet<Person>();
		person.add(new Person(201, "kapil", p1));
		person.add(new Person(202, "mayo", p1));
		service.add(person);
		return person;

	}

	@RequestMapping("/getAll")
	public List<Person> getAll() {
		return service.getAll();
	}
}

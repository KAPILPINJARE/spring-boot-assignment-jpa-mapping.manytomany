package com.capgemini.jpamapping.manytomany.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.capgemini.jpamapping.manytomany.entity.Person;

@Service
public interface MyService {
	public Set<Person> add(Set<Person> person);
	public Person get(int id);
	public List<Person> getAll();
	
}

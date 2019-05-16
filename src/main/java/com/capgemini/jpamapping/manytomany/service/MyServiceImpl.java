package com.capgemini.jpamapping.manytomany.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpamapping.manytomany.dao.PersonDao;
import com.capgemini.jpamapping.manytomany.entity.Person;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private PersonDao dao;
	
	@Override
	public Set<Person> add(Set<Person> person) {
		  dao.saveAll(person);
		  return person;
	}

	@Override
	public Person get(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Person> getAll() {
		return dao.findAll();
	}
}

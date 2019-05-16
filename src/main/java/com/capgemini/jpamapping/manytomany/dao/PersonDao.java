package com.capgemini.jpamapping.manytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpamapping.manytomany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}

package com.capgemini.jpamapping.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@Column(name = "person_id")
	private int personId;
	@Column(name = "person_name")
	private String personName;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Project> project=new HashSet<Project>();

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName, Set<Project> project) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.project = project;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", project=" + project + "]";
	}

}

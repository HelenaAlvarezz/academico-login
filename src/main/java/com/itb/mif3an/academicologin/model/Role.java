package com.itb.mif3an.academicologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Table
@Entity
public class Role {
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	// CONSTRUTORES //
	public Role() {
	}

	public Role(String name) {
		this.name = name;
	}

	public Role(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	// GETs and SETs //
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

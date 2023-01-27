package com.example.mongo.usersDocuments;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Usuarios {
	
	@Id
	private int id;
	
	private String name;
	
	private String last_name;
	
	private String second_last_name;
	
	private String email;

	public Usuarios(int id, String name, String last_name, String second_last_name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.second_last_name = second_last_name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSecond_last_name() {
		return second_last_name;
	}

	public void setSecond_last_name(String second_last_name) {
		this.second_last_name = second_last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}

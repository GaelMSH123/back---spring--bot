package com.example.mongo.documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Books")
public class books {
	
	@Id
	private int id;
	
	private String name;
	
	private String author;
	
	private String type;
	
	private String price;

	public books(int id, String name, String author, String type, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.type = type;
		this.price = price;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}

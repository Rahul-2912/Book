package com.springBoot.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String auther;
	@Column
	private int price;
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
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Books(int id, String name, String auther, int price) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}
	
	

}

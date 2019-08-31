package com.agtech.warehouse.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.agtech.warehouse.domain.interfaces.IProduct;

@Entity
public class Product implements IProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@NotNull
	@Size(max=100)
	@Size(min=5)
	@Column(unique=true)
	private String Name;
	
	@NotNull
	@Column(unique=true)
	private Double Price;
	
	@NotNull
	@Size(max=100)
	@Size(min=5)
	@Column(unique=true)
	private String Company;
	
	@NotNull
	@Column(unique=true)
	private Date ExpDate;
	
	
	public Product() {
		super();
	}


	public Product(long id, String name, Double price, String company, Date expDate) {
		super();
		Id = id;
		Name = name;
		Price = price;
		Company = company;
		ExpDate = expDate;
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Double getPrice() {
		return Price;
	}


	public void setPrice(Double price) {
		Price = price;
	}


	public String getCompany() {
		return Company;
	}


	public void setCompany(String company) {
		Company = company;
	}


	public Date getExpDate() {
		return ExpDate;
	}


	public void setExpDate(Date expDate) {
		ExpDate = expDate;
	}
	
	
}

package com.agtech.warehouse.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
	@Temporal(TemporalType.DATE)
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


	@Override
	public void create(String name, Double price, String company, Date expdt) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean update(Long id, Product prd) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Product read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> getProductsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> getProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> getProductsByExpDate() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> getProductsByPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> sortProductsByCompanyReverse() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> sortProductsByPriceReverse() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> sortProductsByExpDateReverse() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> sortProductsByIdReverse() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> findAllProductsExpDateBetween(String name, Date ExpDateStart, Date ExpDateEnd) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> findAllProductsPriceBetween(String name, Double priceStart, Double priceEnd) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> findAllWithExpDate(String name, Date expirationDate) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}

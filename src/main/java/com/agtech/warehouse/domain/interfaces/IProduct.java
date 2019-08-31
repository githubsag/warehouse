package com.agtech.warehouse.domain.interfaces;

import java.util.Date;
import java.util.List;

import com.agtech.warehouse.domain.Product;

public interface IProduct {

	public void create(String name, Double price, String company, Date expdt);
	public void delete(Long id);
	public boolean update(Long id, Product prd);
	public Product read(Long id);
	public List<Product> getProductById(Long id);
	public List<Product> getProductByName(String name);
	public List<Product> sortProductByCompany();
	public List<Product> sortProductByPrice();
	
}

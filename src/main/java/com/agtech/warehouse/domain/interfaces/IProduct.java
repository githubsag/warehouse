package com.agtech.warehouse.domain.interfaces;

import java.util.Date;
import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.Query;

import com.agtech.warehouse.domain.Product;

public interface IProduct {

	public void create(String name, Double price, String company, Date expdt);
	public void delete(Long id);
	public boolean update(Long id, Product prd);
	public Product read(Long id);
	public List<Product> getProductsById(Long id);
	public List<Product> getProductsByName(String name);
	public List<Product> getProductsByExpDate();
	public List<Product> getProductsByPrice(Double price);
	public List<Product> getAll();
	public List<Product> sortProductsByCompanyReverse();
	public List<Product> sortProductsByPriceReverse();
	public List<Product> sortProductsByExpDateReverse();
	public List<Product> sortProductsByIdReverse();
	public List<Product> findAllProductsExpDateBetween(String name, Date ExpDateStart, Date ExpDateEnd);
	public List<Product> findAllProductsPriceBetween(String name, Double priceStart, Double priceEnd);
	
/*
 * JPQL to find all the products with name and expiration date.
 */
	@Query("select a from Product a where a.name = 1? and a.expirationDate <= ?2")
	public List<Product> findAllWithExpDate(String name, Date expirationDate);
}

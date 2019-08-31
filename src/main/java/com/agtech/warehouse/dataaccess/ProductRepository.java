package com.agtech.warehouse.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agtech.warehouse.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

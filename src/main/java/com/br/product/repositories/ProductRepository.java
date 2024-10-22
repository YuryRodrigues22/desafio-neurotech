package com.br.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.product.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

package com.br.product.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.product.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p " + "WHERE (LOWER(p.nome) LIKE LOWER(CONCAT('%',:nome,'%')) ) ")
	Page<Product> findByName(@Param("nome") String nome, Pageable pageable);

	@Query("SELECT p FROM Product p " + "WHERE (:nome IS NULL OR LOWER(p.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) "
			+ "ORDER BY p.preco " + "ASC")
	Page<Product> filtrarPorNomeEOrdenarPorPrecoAsc(@Param("nome") String nome, Pageable pageable);

	@Query("SELECT p FROM Product p " + "WHERE (:nome IS NULL OR LOWER(p.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) "
			+ "ORDER BY p.preco " + "DESC")
	Page<Product> filtrarPorNomeEOrdenarPorPrecoDesc(@Param("nome") String nome, Pageable pageable);

}

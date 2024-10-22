package com.br.product.dto;

import java.io.Serializable;
import java.util.Date;

import com.br.product.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotBlank(message = "O nome do produto obrigatório")
	private String nome;
	private String descricao;
	
	
	@Positive(message = "Preço deve ser positivo e maior que 0")
	private Double preco;
	
	@Positive(message = "A quantidade em estoque deve ser maior que 0")
	private Long qtdEstoque;

	private Date data;

	public ProductDTO() {
	}

	public ProductDTO(Long id, String nome, String descricao, Double preco, Long qtdEstoque, Date data) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.data = data;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		preco = entity.getPreco();
		qtdEstoque = entity.getQtdEstoque();
		data = entity.getData();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Long qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}



}

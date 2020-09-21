package com.produto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	

}
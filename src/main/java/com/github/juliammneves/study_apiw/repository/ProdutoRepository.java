package com.github.juliammneves.study_apiw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.juliammneves.study_apiw.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}

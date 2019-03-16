package com.algaworks.wine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.wine.model.Vinho;
/**
 * 
 * @author Douglas
 * Adiciona a classe e o tipo da chave primaria
 * @param <T>
 */
public interface VinhosRepository extends JpaRepository<Vinho, Long>{

}

package com.mt.ecommerce.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {

	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	private BigDecimal preco;
}

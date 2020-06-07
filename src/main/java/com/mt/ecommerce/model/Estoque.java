package com.mt.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estoque")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estoque {
	
	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Column(name = "produto_id")
	private String produtoId;
	
	private Integer quantidade;

}

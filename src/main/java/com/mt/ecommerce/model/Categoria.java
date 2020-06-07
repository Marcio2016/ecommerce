package com.mt.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria {
	
	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String nome;
	
	@Column(name = "categoria_pai_id")
	private Integer categoriaPaiId;

}

package com.mt.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
	
	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	private String nome;
	
	private SexoCliente sexo;

}

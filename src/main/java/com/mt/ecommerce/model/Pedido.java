package com.mt.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido {
	
	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Column(name = "data_pedido")
	private LocalDateTime dataPedido;
	
	@Column(name = "data_conclusao")
	private LocalDateTime dataConclusao;
	
	@Column(name = "nota_fiscal_id")
	private Integer notaFiscalId;
	
	private BigDecimal total;
	
	private StatusPedido status;

}

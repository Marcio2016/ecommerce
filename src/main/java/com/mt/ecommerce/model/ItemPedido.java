package com.mt.ecommerce.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item_pedido")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItemPedido {

		@Id
	 	@EqualsAndHashCode.Include
	    private Integer id;
		
		@Column(name = "pedido_id")
	    private Integer pedidoId;
		
		@Column(name = "produto_id")
	    private Integer produtoId;
		
		@Column(name = "preco_produto")
	    private BigDecimal precoProduto;

	    private Integer quantidade;
}

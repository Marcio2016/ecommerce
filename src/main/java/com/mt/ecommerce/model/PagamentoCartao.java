package com.mt.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pagamento_cartao")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PagamentoCartao {

	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Column(name = "pedido_id")
    private Integer pedidoId;

    private StatusPagamento status;

    private String numero;
}

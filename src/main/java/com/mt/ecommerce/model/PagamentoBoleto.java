package com.mt.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pagamento_boleto")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PagamentoBoleto {

	@Id
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Column(name = "pedido_id")
	private Integer pedidoId;

    private StatusPagamento status;
    
    @Column(name = "codigo_barras")
    private String codigoBarras;
}

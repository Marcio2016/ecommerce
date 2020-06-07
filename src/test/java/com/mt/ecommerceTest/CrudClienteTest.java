package com.mt.ecommerceTest;

import org.junit.Assert;
import org.junit.Test;

import com.mt.ecommerce.model.Cliente;

public class CrudClienteTest extends EntytiManagerTest{

	@Test
	public void ConsultarClientePorId() {
		Cliente cliente = entityManager.find(Cliente.class, 3);
		
		Assert.assertEquals("Vegeta Sama", cliente.getNome());
	}
	
	@Test
	public void salvarGuerreiroZ() {
		Cliente cliente = new Cliente();
		
		cliente.setId(3);
		cliente.setNome("Piccolo");
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		
		
		entityManager.clear();
		
		Cliente clientePersistido = entityManager.find(Cliente.class, 3);
		
		Assert.assertNotNull(clientePersistido);
		Assert.assertEquals("Piccolo", cliente.getNome());
	}
}

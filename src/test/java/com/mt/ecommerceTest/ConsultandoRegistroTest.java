package com.mt.ecommerceTest;

import org.junit.Assert;
import org.junit.Test;

import com.mt.ecommerce.model.Produto;

public class ConsultandoRegistroTest extends EntytiManagerTest {	
	    
	    @Test
	    public void buscarPorId() {
	    	Produto produto =  entityManager.find(Produto.class, 1);
	    	
	    	Assert.assertNotNull(produto);
	    	Assert.assertEquals("Kindle",produto.getNome());
	    }
}

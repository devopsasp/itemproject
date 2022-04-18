package com.sample.ItemProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.dao.ItemService;
import com.model.*;

import junit.framework.Assert;
@SpringBootTest
class ItemProjectApplicationTests {

	@Autowired
	ItemService service;
	@Test
	void contextLoads() {
	
	}
	
	
	@Test 
	void getItem()
	{
		Item item=new Item();
		item.setItemName("Coffee");
		item.setPrice(200);
		service.add(item);
		Item item1=service.find(item.getItemId());
		
	  Assert.assertEquals("Coffee",item1.getItemName());
	  Assert.assertEquals(200.0f, item.getPrice());
	}
	
	
	
	

}

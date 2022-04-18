package com.sample.ItemProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.ItemService;
import com.model.*;

import junit.framework.Assert;
@SpringBootTest
class ItemTest {
	@Autowired
	ItemService service;

	@Test
	void testAdd() {
		
		Item item=new Item();
		item.setItemName("Coffee");
		item.setPrice(200);
		service.add(item);
		
		Item item_to_be_tested=service.find(item.getItemId());
		Assert.assertEquals("Coffee", item_to_be_tested.getItemName());
	   Assert.assertEquals(200.0f, item.getPrice());
	}

	
	@Test
	void validateTestForItem()
	{
		Item item=new Item();
		item.setPrice(99);
		try {
		service.add(item);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 Item item1=service.find(item.getItemId());
		Assert.assertNull(item1);
	}
	
	/*@Test
	void testFind() {
		
	}*/

	@Test
	void testFindAll() {
		
	
	}

	/*@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}
*/
}

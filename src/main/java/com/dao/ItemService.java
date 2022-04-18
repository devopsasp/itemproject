package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.model.*;
import java.util.*;
@Service
public class ItemService {
	
	@Autowired
	ItemDAO itemDAOImpl;
	
	public void add(Item item)
	{
		itemDAOImpl.addItem(item);
	}
	public Item find(int id)
	{
		return itemDAOImpl.findItem(id);
	}
	public List<Item> findAll()
	{
		return itemDAOImpl.findAllItem();
	}
	public boolean update(Item item)
	{
		return itemDAOImpl.updateItem(item);
	}
	public boolean delete(int id)
	{
		return itemDAOImpl.deleteItem(id);
	}

}

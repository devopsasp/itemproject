package com.dao;

import org.springframework.stereotype.Repository;
import java.util.*;
import com.model.*;
@Repository
public interface ItemDAO {
	
	public void addItem(Item item);
	public Item findItem(int id);
	public List<Item> findAllItem();
	public boolean updateItem(Item item);
	public boolean deleteItem(int id);

}

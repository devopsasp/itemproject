package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Item;

@Component
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(item);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Item findItem(int id) {
		Session session=sessionFactory.openSession();
	    Item item=session.find(Item.class, id);
		// TODO Auto-generated method stub
		return item;
	}

	@Override
	public List<Item> findAllItem() {
		Session session=sessionFactory.openSession();
		List<Item> itemlist=session.createQuery("select i from Item i").list();
				
		// TODO Auto-generated method stub
		return itemlist;
	}

	@Override
	public boolean updateItem(Item item) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(item);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteItem(int id) {
		Session session=sessionFactory.openSession();
		Item item=session.find(Item.class, id);
		session.getTransaction().begin();
		session.delete(item);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return false;
	}

}

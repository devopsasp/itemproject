package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.dao.ItemService;
import com.model.*;
@RestController
public class ItemRestController {
	
	@Autowired
	ItemService service;
  
	   @GetMapping("/getitems")
	   public List<Item> getAllItems()
	   {
		   return service.findAll();
	   }
	   
	   @PostMapping("/additem")
	   public ResponseEntity<?> addItem(@RequestBody Item item)
	   {
		service.add(item);
		return ResponseEntity.status(HttpStatus.OK).body("Entity item added success fully");
	   }
	   
	   @DeleteMapping("/deleteitem/{id}")
	   public ResponseEntity<?> deleteItem(@PathVariable int id)throws DeleteItemException 
	   {
		   Item item=service.find(id);
		   if(item==null)
		   {
			    throw new DeleteItemException(id);
		   }
		
		     	   service.delete(id);   
		      return ResponseEntity.ok("element deleted successfully");
	   }
	   

}

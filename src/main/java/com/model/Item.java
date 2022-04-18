package com.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Item {
	
	@Id
	@GeneratedValue
	private int itemId;
	
    @NotNull(message="Item Name cannot be null")
   @Column(name="ProductName")
	private String itemName;
    
    @Max(value=300)
    @Min(value=100)
	private float price;
	
	  public Item()
	  {
		  
	  }

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	  
	  
	  

}

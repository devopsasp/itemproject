package com.controller;

public class DeleteItemException  extends RuntimeException{

	private int id;
	public DeleteItemException(int id) {
		
		super("id "+id+" not found");
		this.id=id;
	}

	@Override
	public String toString() {
		return "id "+ id +" not available";
	}
	
	
	
}

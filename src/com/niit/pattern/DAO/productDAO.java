package com.niit.pattern.DAO;

import java.util.List;

import com.niit.pattern.entity.product;

public interface productDAO {
	
	product get(int id);
	List<product> list();
	List<product> getByBrand(String Brand);
	boolean add(product Product);
	boolean update(product Product);
	boolean delete(product Product);
	
}

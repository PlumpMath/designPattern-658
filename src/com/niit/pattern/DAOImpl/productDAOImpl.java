package com.niit.pattern.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import com.niit.pattern.DAO.productDAO;
import com.niit.pattern.entity.product;

public class productDAOImpl implements productDAO {
	//
	private static productDAO ProductDAO = null;
	
	//
	public static productDAO getproductDAO(){
		if(ProductDAO == null){
			ProductDAO = new productDAOImpl();
		}
		return ProductDAO;
	}
	
	//
	List<product> products = null;
	
	//
	private productDAOImpl() {
		products = new ArrayList<>();
		products.add(new product(1,10,"DELL INP","DELL","LAPTOP","THIS .....",20000));
		products.add(new product(2,9,"DELL DESKTOP","DELL","PC","THIS .....",18000));
		products.add(new product(3,8,"HP G960","HP","LAPTOP","THIS .....",25000));
	}
	
	@Override
	public product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<product> list() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public boolean add(product Product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(product Product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(product Product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<product> getByBrand(String Brand) {
		List<product> Temp = new ArrayList<>();
		for(product Product : products){
			if(Product.getBrand().equals(Brand)){
				Temp.add(Product);
			}
		}
		return Temp;
	}
}

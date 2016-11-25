package com.niit.pattern.DesignPattern;

import com.niit.pattern.DAO.productDAO;
import com.niit.pattern.DAOImpl.productDAOImpl;
import com.niit.pattern.entity.product;

public class DesignPattern {
	private static productDAO ProductDAO = productDAOImpl.getproductDAO();
	public static void main(String[] args) {
		//Listing the all product in Array: 
		System.out.println("1. Listing the product:");
		AllProducts();
		
		//Listing the product in category wise:
		System.out.println("2. Listing the product form Brand:");
		AllproductbyBrand("DELL");
	}
		
	
	private static void AllproductbyBrand(String Brand) {
		for (product Product : ProductDAO.getByBrand(Brand)) {
			System.out.println(Product);
		}
	}


	private static void AllProducts(){
			for (product Product : ProductDAO.list()) {
				System.out.println(Product);
			}
		}
	}

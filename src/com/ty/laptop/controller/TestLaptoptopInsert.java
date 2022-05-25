package com.ty.laptop.controller;

import java.util.ArrayList;

import com.ty.laptop.dao.LaptopDao;
import com.ty.laptop.dto.Laptop;

public class TestLaptoptopInsert {

	public static void main(String[] args) {
		//creating the Laptop Objects
		Laptop l1 = new Laptop();
		l1.setId(10);
		l1.setBrand("HP");
		l1.setRam("6gb");
		l1.setPrice(50000);

		Laptop l2 = new Laptop();
		l2.setId(11);
		l2.setBrand("Apple");
		l2.setRam("12gb");
		l2.setPrice(150000);

		Laptop l3 = new Laptop();
		l3.setId(12);
		l3.setBrand("Dell");
		l3.setRam("8gb");
		l3.setPrice(45000);

		Laptop l4 = new Laptop();
		l4.setId(13);
		l4.setBrand("Acer");
		l4.setRam("8gb");
		l4.setPrice(40000);

		// Adding Laptop objects to ArrayList
		ArrayList<Laptop> list = new ArrayList<>();

		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);

		// creating object of LaptopDao class to call it's non-static methods
		LaptopDao dao = new LaptopDao();
		
		// to store single laptop data
		//dao.saveLaptop(l1);

		// to store list of laptop data
		//dao.saveLaptop(list);

		// to fetch all the data
		//dao.displayAll();

		// to fetch data by id
		dao.searchById(6);
		

		// to fetch data by brand
		//dao.searchByBrand(null);
		

		// to fetch data by ram
		//dao.searchByRam(null);
		

		// to fetch data by price
		//dao.searchByPrice(0.0);

		// to fetch data by price below given price
		//dao.searchByPriceBelow(null);
		
		// to fetch data by price above given price
		//dao.searchByPriceAbove(null);
		
		// to fetch data by price between given price
		//dao.serachByPriceBetween(null, null);
		
		
		/* int res =
		if( res != 0 ) {
			System.out.println("Data inserted");
		}
		else {
			System.out.println("No Data inserted");
		} */

	}

}

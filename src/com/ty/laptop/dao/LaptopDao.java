package com.ty.laptop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.ty.laptop.dto.Laptop;
import com.ty.laptop.util.ConnectionObject;

public class LaptopDao {

	// Establishing the Connection.
	Connection connection = ConnectionObject.getConnection(); 

	// Accessing the Dto and inserting data into database ( for single Object)
	public int saveLaptop(Laptop l) {

		// SQL Query to insert data into database
		String sql = "INSERT INTO LAPTOP VALUES(?,?,?,?)" ;

		// Establishing the statement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// assigning values 

			preparedStatement.setInt(1, l.getId());
			preparedStatement.setString(2, l.getBrand());
			preparedStatement.setString(3, l.getRam());
			preparedStatement.setDouble(4, l.getPrice());

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	// inserting batch of laptop into database
	public int saveLaptop( List<Laptop> list ) {

		// SQL Query to insert data into database
		String sql = "INSERT INTO LAPTOP VALUES(?,?,?,?)" ;

		// Establishing the Connection.


		// Establishing the statement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// assigning values 
			for( Laptop l : list ) {

				preparedStatement.setInt(1, l.getId());
				preparedStatement.setString(2, l.getBrand());
				preparedStatement.setString(3, l.getRam());
				preparedStatement.setDouble(4, l.getPrice());

				preparedStatement.addBatch();

			}
			int[] a = preparedStatement.executeBatch();

			return a[0];

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	// To display all the details
	public void displayAll() {
		String sql = "Select * from laptop";

		try {
			Statement statement = connection.createStatement();

			ResultSet res	= statement.executeQuery(sql);

			while(res.next()) {

				System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		public void searchById(int index) {
			String sql = "Select * from laptop where id="+index;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		public void searchByBrand(String brand) {
			String sql = "Select * from laptop where brand="+brand;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void searchByRam(String ram) {
			String sql = "Select * from laptop where ram="+ram;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void searchByPrice(Double price) {
			String sql = "Select * from laptop where price="+price;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void searchByPriceAbove(Double price) {
			String sql = "Select * from laptop where price>="+price;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void searchByPriceBelow(Double price) {
			String sql = "Select * from laptop where price<="+price;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void searchByPriceBetween(Double lowerlimit , Double upperlimit) {
			String sql = "Select * from laptop where price BETWEEN  "+lowerlimit+" AND "+upperlimit ;
			
			try {
				Statement statement = connection.createStatement();
				
				ResultSet res	= statement.executeQuery(sql);  
				
				while(res.next()) {
					
					System.out.println( "Laptop [id=" + res.getInt(1) + ", brand=" + res.getString(2) + ", ram=" + res.getString(3) + ", price=" + res.getDouble(4) + "]" );
					
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}









}

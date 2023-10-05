package com.lulu.database.product_table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BusinessLogic_Product {

	//CRUD Operations

	void createData() {

	}
	void readData() throws SQLException {

		Connection connection=ConnectDB_product.setupConnection();


		 Statement statement;

		 statement = connection.createStatement();

         ResultSet resultSet;

         resultSet = statement.executeQuery(

             "select * from product where id>=111");

         int id;

         String name;

         int cost;
         
         String descrip;

         while (resultSet.next()) {

             id = resultSet.getInt("id");

             name = resultSet.getString("name");

             cost=resultSet.getInt("cost");
             
             descrip=resultSet.getString("descrip");

             System.out.println("id : " + id

                                + "      name : " + name +"      cost: "+ cost+"       descrip:"+descrip);

         }




 

	}


void updateData() throws SQLException {
	
		
		Connection connection = ConnectDB_product.setupConnection();
		String query = "update product set name= ? where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setString(1, "Shravya");
		myStmt.setInt(2, 333);
		boolean success = myStmt.execute();
		System.out.println("Updated Successfully " + success);

	}

	
	
	
	
	

	void deletData() throws SQLException {
		Connection connection = ConnectDB_product.setupConnection();
		String query = "delete from product where id = ? ";
		PreparedStatement myStmt = connection.prepareStatement(query);
		myStmt.setInt(1,333 );
		boolean success = myStmt.execute();
		System.out.println("Deleted Successfully " + success);

	}


 

}

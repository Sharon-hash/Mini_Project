package com.lulu.database.product_table;

import java.sql.SQLException;

import com.lulu.database.product_table.BusinessLogic_Product;



public class ControllerTester_product {

 

	public static void main(String[] args) throws SQLException {

		// TODO Auto-generated method stub


		BusinessLogic_Product bl= new BusinessLogic_Product();

//		bl.createData();

		bl.readData();

//	bl.deletData();

//		bl.updateData();

 

	}

 

}

package com.lulu.database.product_table;

import java.sql.Connection;

import java.sql.DriverManager;

 

public class ConnectDB_product {

	static Connection connection;
	static Connection setupConnection() {


	try {

		 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up


         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sharon",

            "root", "Sharon@2001");

	}

	catch(Exception E) {


	}



	return connection;

 

}

}

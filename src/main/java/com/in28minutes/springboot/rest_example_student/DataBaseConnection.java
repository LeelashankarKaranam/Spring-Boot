package com.in28minutes.springboot.rest_example_student;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection
{
    public static void main(String[] args) throws SQLException
    {
 
    	
	  //create a connection 
    	//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
    	Connection con=DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/mydb","root","root");   
    	//create a query/statement
    	Statement stmt=con.createStatement();
    	//String s ="INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (9, 'Jhnerryone', 'tKansxo', 68000000, '2025-01-15', 'IT(SOftware)')";
    	String s = "UPDATE reward SET date_reward = '2019-05-11', amount = 50000 WHERE Employee_ref_id = '1';";

    	
    	//String s="update reward set (Employee_ref_id, date_reward, amount) where ( '1','2019-05-11',50000) ";
    	//execute statement
    	stmt.execute(s);
    	//close connection
    	con.close();
    	System.out.println("program completed");
    } 
}
 
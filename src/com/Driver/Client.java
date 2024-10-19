package com.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import com.shopping.GSNormalAcc;
import com.shopping.GSPrimeAcc;
import com.shopping.GSShopFactory;
import com.Abstract.NormalAcc;
import com.Abstract.PrimeAcc;
import com.Abstract.ShopFactory;

public class Client {

	private static Connection cn;
	private static Statement stmt;
	private static PreparedStatement ps;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("...............WELCOME TO GOSHOPPING APP........................");
		System.out.println("..............Please CONTINUE YOU SHOPPING.............");
		int i=0;
		//jdbc implementation
		try {
			//step 1:load or register the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			//step 2:create connection between java and db
		    cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_db","root","root");
		    
		    //step 3 :create statement object
			Statement stmt =cn.createStatement();
	        System.out.println("Statement created successfully..");
	
	        //Result is an object 
			//Represent the data which is there in db
			
			/*java.sql.ResultSet rs = null;
			rs = stmt.executeQuery("select * from products_list");
	        System.out.println("Product Name\t|\t"+"Product Price\t");
	
				while(rs.next())
				{
				
						System.out.println(rs.getString(1)+"\t|\t"+rs.getFloat(2));
						i++;
				}
					
				*/
			
			//String p="create table Prime_user_Data(User_id int NOT NULL,user_name varchar(25) NOT NULL,PRIMARY KEY(User_id))";
	        //boolean b=stmt.execute(p);
	        
	        
		}catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
	
	//scanner class to 
	Scanner sc=new Scanner(System.in);
	
	//Hashmap to store values in key value pair
    //HashMap<String,Float> products=new HashMap<>();
    

    System.out.println();
    
    
    //Creating reference of abstract class to its concrete class
    ShopFactory sf=new GSShopFactory();
    
    //declaring required fields in driver class
    int accNo = 0;
	String accName = null;
	String ans;
	String dob;
	String city;
	float pTotal=0.0f;
	float pPrice;
    boolean isPrime=true;
   

    
    //taking input from user
    System.out.println("Enter your Account Number:");
    accNo=sc.nextInt();
    
    System.out.println("Enter your Name:");
    accName=sc.next();
    
    System.out.println("Enter your City:");
    city=sc.next();
    int id=4;
    System.out.println("Enter your date of birth(format:12/03/1991):");
    dob=sc.next();
    try {
    PreparedStatement pmt=null;
    	
    String e="INSERT INTO Prime_User_Data(user_id,user_name,user_city,user_dob,account_no)"+"VALUES(?,?,?,?,?)";
    pmt=cn.prepareStatement(e);
    pmt.setInt(1,id);
    pmt.setString(2, accName);
    pmt.setString(3,city);
    pmt.setString(4, dob);
    pmt.setInt(5, accNo);
    int status=pmt.executeUpdate();
    if(status>0)
    {
    	System.out.println("inserted....");
    }
    cn.close();
    }catch(Exception e)
   {
	   System.out.println(e.getMessage());
   }
		

    
    System.out.println("Please Enter no of products:");
    int nProduct=sc.nextInt();
    while(nProduct>0)
    {
    	    System.out.println("Please Add Product Name:");
    	    String pName=sc.next();
    		System.out.println("Please Add Product Amount:");
    		pPrice=sc.nextFloat();
    		//products1.put(pName,pPrice);
    		pTotal=pTotal+pPrice;
    	
    	    nProduct--;
    }
    
	System.out.println("Type yes if you are a prime member and type no if not:");
    ans=sc.next();
    if(ans.toLowerCase().equals("yes"))
    {
    	PrimeAcc pn=new GSPrimeAcc(accNo,accName,pTotal,isPrime);
    	pn.bookProducts(pn.getCharges());
    	System.out.println(pn);
    }
    else if(ans.toLowerCase().equals("no"))
    {
    	
    	NormalAcc np=new GSNormalAcc(accNo,accName,pTotal,79);
    	np.bookProducts(79);
    	System.out.println(np);
    }
    else
    {
    	System.out.println("Please Enter valid credentials..");
    }
		}
	
	




	}
	




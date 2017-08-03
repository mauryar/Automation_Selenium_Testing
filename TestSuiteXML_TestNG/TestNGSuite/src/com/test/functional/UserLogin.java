package com.test.functional;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserLogin {
  
	@BeforeClass
	public void login(){
		System.out.println("Login Successful");
	}
	
	@Test (priority = 1)
	public void addVendor(){
		System.out.println("Add vendor successful");
	}
	
	@Test (priority = 2)
	public void addProduct(){
		System.out.println("Add product successful");
	}
	
	@Test (priority = 3)
	public void addCurrency(){
		System.out.println("Add currency successful");
	}
	
	@AfterClass
	public void logout(){
		System.out.println("Logout Successful");
	}
	
}

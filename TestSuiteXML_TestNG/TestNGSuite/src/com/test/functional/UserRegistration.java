package com.test.functional;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserRegistration {

	@BeforeClass
	public void login(){
		System.out.println("Login Successful");
	}
	
	@Test (priority = 11)
	public void deleteVendor(){
		System.out.println("Delete vendor successful");
	}
	
	@Test (priority = 12)
	public void deleteProduct(){
		System.out.println("Delete product successful");
	}
	
	@Test (priority = 13)
	public void deleteCurrency(){
		System.out.println("Delete currency successful");
	}
	
	@AfterClass
	public void logout(){
		System.out.println("Logout Successful");
	}
	
}

package com.app.model;

public class Employee {
	private static String empEmail = "vijay@gmail.com";
	private static String empPassword = "vija123@";
	
	public static int employeValidate( String email,String password) {
		int result = 0;
		if(empEmail.equals(email) && empPassword.equals(password)){
			result = 1;
		}
		return result;
	}
	
}


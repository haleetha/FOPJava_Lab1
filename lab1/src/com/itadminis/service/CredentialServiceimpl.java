package com.itadminis.service;

import java.util.Random;

import com.itadminis.model.Employee;

public class CredentialServiceimpl implements CredentialService{

	
	static String email;
	static String password;
	//static String password;
	public String generateEmail(String fullName, String dept) {
		  email=fullName+"@"+dept+"naukri.com";
		return email;
	}

	
	public String generatePassword() {
		
		
		String pwHelper="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*_+-/.,><?";
		
		
		
		//random method to generate pw
		
		
		Random r=new Random();
		
		char[] pw=new char[8];
		
		for(int i=0;i<8;i++)
		{
			pw[i]=pwHelper.charAt(r.nextInt(pwHelper.length()));
		}
		
		password=pw.toString();
		return password;
	}
	

	
	public void showCredentials(Employee employee, String email, String password) {
		System.out.println("Dear "+employee.getEmployeeName()+" your generated credentials are as follows ..>");
		System.out.println("Email id: "+email);
		System.out.println("Generated password is..>"+password);
		
	}

 
}

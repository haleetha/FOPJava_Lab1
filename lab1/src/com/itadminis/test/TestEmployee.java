package com.itadminis.test;

import java.util.Scanner;

import com.itadminis.model.Employee;
import com.itadminis.service.CredentialServiceimpl;

public class TestEmployee {
public static void main(String[] args)
{
	Employee employee=new Employee("Haleetha","Begum");
	CredentialServiceimpl cs=new CredentialServiceimpl();
	String generatedEmail;
	String generatedPw;
	
	System.out.println("Enter your department");
	System.out.println("1. Technincal \n 2.Legal \n 3. HR \n 4.finance");
	
	
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	String deptName="";
	switch(option)
	{
	case 1:deptName="Tech";
	break;
	case 2:deptName="Legal";
	break;
	case 3:deptName="hr";
	break;
	case 4:deptName="fin";
	break;
	default:
		System.out.println("not a valid option!!");
		break;
	}
		generatedEmail=cs.generateEmail(employee.getEmployeeName().toLowerCase(), deptName);
		generatedPw=cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPw);
	
	}

}


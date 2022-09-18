package com.itadminis.service;

import com.itadminis.model.Employee;

public interface CredentialService {
	
	public String generateEmail(String fullName, String dept);
	public String generatePassword();
	public void showCredentials(Employee employee, String email, String genPw);

}

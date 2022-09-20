package org.greatlearnings.highTech.service;

import java.util.Random;

import org.greatlearnings.highTech.model.Employee;

public class CredentialSurvice {

	public String generateEmailAddress(String firstname,String lastName,String department)
	{
		return firstname+lastName+"@"+department+".greatlearning.com";
	}
			public char[] generatePassword()
{
	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String specialCharacters="~@#$%^&*_+<>?";
	String values=capitalLetters+smallLetters+numbers+specialCharacters;
	Random random=new Random();
	char[] password=new char[10];
	for (int i=0;i<10;i++);
	
		int i = 0;
		password[i]=values.charAt(random.nextInt(values.length()));
		{
			return password;
		}
}
public void showCredentials(Employee e,String email,char[] generatedPassword)
{
	System.out.println("Dear"+ e.getFirstname()+" your generated credentials are as follows");
    System.out.println("Email------>"+email);
    System.out.println("Password--->"+generatedPassword);
	} 
}
	// TODO Auto-generated method stub
		// TODO Auto-generated method stu
		


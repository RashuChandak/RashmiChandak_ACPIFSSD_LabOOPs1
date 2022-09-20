package org.greatlearnings.highTech.service;

import java.util.Scanner;

import org.greatlearnings.highTech.model.Employee;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CredentialSurvice credentialSurvice=new CredentialSurvice();
		Employee e=new Employee("Joshi","Komal");
		int ch;
		do
		{
	System.out.println("Please enter the department from the following");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resource");
	System.out.println("4.Legal");
	ch=sc.nextInt();
	switch (ch) {
	case 1:
String email=credentialSurvice.generateEmailAddress(e.getFirstname(),e.getLastName(),"Techno");
char[] password=credentialSurvice.generatePassword();
credentialSurvice.showCredentials(e, email, password);
		
		break;

	case 2:
		String email1=credentialSurvice.generateEmailAddress(e.getFirstname(),e.getLastName(),"Admin");
		char[] password1=credentialSurvice.generatePassword();
		credentialSurvice.showCredentials(e, email1, password1);
		break;
		
	case 3 :
		String email2=credentialSurvice.generateEmailAddress(e.getFirstname(),e.getLastName(),"HR");
		char[] password2=credentialSurvice.generatePassword();
		credentialSurvice.showCredentials(e, email2, password2);
		break;
	case 4 :
		String email3=credentialSurvice.generateEmailAddress(e.getFirstname(),e.getLastName(),"LegalD ");
		char[] password3=credentialSurvice.generatePassword();
		credentialSurvice.showCredentials(e, email3, password3);
		break;
		
		default:
			break;
	}
		}while(ch<=4);
     }
		}
	
	
		//TODO Auto-generated method stub



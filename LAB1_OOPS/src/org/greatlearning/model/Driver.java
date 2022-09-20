package org.greatlearning.model;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		CredentialServices cs=new CredentialServices();
		Employee e=new Employee("Virendra","Singh");

		int ch;
		do {
			System.out.println("Please enter your department from the following");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human_Resources");
			System.out.println("4.Legal");

			ch=scan.nextInt();

			switch(ch) {
			case 1:
				String email=cs.generateEmailAddress(e.getFirstName(), e.getLastName(),"Technical");
				char[] password= cs.generatePassword();
				cs.showCredentials(e, email, password);
				break;
			case 2:
				String email1=cs.generateEmailAddress(e.getFirstName(), e.getLastName(),"Admin");
				char[] password1= cs.generatePassword();
				cs.showCredentials(e, email1, password1);
				break;
			case 3:
				String email2=cs.generateEmailAddress(e.getFirstName(), e.getLastName(),"Human Resources");
				char[] password2= cs.generatePassword();
				cs.showCredentials(e, email2, password2);
				break;
			case 4:
				String email3=cs.generateEmailAddress(e.getFirstName(), e.getLastName(),"Legal");
				char[] password3= cs.generatePassword();
				cs.showCredentials(e, email3, password3);
				break;

			}

		}while(ch<=4);

	}

}

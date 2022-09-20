package org.greatlearning.model;

import java.util.Random;

public class CredentialServices {
	public String generateEmailAddress(String firstName,String lastName,String department) {
		return firstName+lastName+"@"+department+".greatlearning.com";
	}

	public char[] generatePassword() {

		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*()_<>?";
		String values=capitalLetters+smallLetters+numbers+specialCharacters;

		Random random=new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	}


	public void showCredentials(Employee e,String email,char[] generatedPassword) {

		System.out.println("Dear "+e.getFirstName()+" your generated credentials are as follows" );
		System.out.println("Email---->"+ email);
		System.out.println("Password----->"+generatedPassword );
	}

}

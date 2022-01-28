package com.simplilearn;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static void main(String[] args) {
		
		ArrayList<String> email= new ArrayList<String>();
		
		email.add("KUMAR9@gmail.com");
		email.add("EXample@domain.com");
		email.add("xyz.com");
		email.add("Naveen9@domain.co.in");
		email.add("learnyahoo.com");
		email.add("Abc9@gmail.co.in");
		email.add("Pro360.xyz");
		email.add("NaV_1999@gmail.com");
		email.add("1359#dot.com");
				
		String regex= "[A-za-z0-9]+@(.+)$";
				
		Pattern pattern1 = Pattern.compile(regex);
		
		for(String emailx: email)
		{
			Matcher matcher = pattern1.matcher(emailx);
			System.out.println(email +":"+ matcher.matches());
			}
		
				
	}

}

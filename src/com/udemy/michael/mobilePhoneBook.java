package com.udemy.michael;

import java.util.ArrayList;
import java.util.Scanner;



public class mobilePhoneBook {
	private static Scanner scan = new Scanner(System.in);
	
	private String name;
	private String phoneNumber;
	
	ArrayList<String> namesArray = new ArrayList<String>();
	
	ArrayList<Integer> phoneNumberArray =  new ArrayList<Integer>();
	
	
	public static String saveNames() {
		System.out.println("Please Enter First & Last Name to save \n");
		String name = "";
		name = scan.nextLine();
		if (!name.isEmpty()) {
			System.out.println("The name " + name + " has been saved");
			return name;
		}else {
		return "No name has been entered";
		}
		
		
	}
	
	
	
	

}

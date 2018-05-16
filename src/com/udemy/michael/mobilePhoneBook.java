package com.udemy.michael;

import java.util.ArrayList;
import java.util.Scanner;



public class mobilePhoneBook {
	private static Scanner scan = new Scanner(System.in);
	
	ArrayList<String> names = new ArrayList<String>();
	
	ArrayList<Integer> phoneNumber =  new ArrayList<Integer>();
	
	
	public static void saveNames(String Name) {
		System.out.println("Please Enter First & Last Name to save \n");
		
		
		if (!Name.isEmpty()) {
			System.out.println("The name " + Name + "has been saved");
		}
		System.out.println("No name has been entered");
		
	}
	
	
	
	

}

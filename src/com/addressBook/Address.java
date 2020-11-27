package com.addressBook;

import java.util.Scanner;

public class Address {
	private String First_Name;
	private String Last_Name;
	private String Address;
	private String Zip;
	private String Phone_Number;
	private String Email;
	
	Address() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		First_Name=sc.nextLine();
		System.out.println("Enter the last name");
		Last_Name=sc.nextLine();
		System.out.println("Enter the Address");
		Address=sc.nextLine();
		System.out.println("Enter the zip code");
		Zip=sc.nextLine();
		System.out.println("Enter the Phone Number");
		Phone_Number=sc.nextLine();
		System.out.println("Enter the Email address");
		Email=sc.nextLine();
	}
	
	public String getFirst_Name() {
		return First_Name;
	}
	
	public void setFirst_Name(String first_Name) {
		First_Name=first_Name;
	}
	
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name=last_Name;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address=address;
	}
	
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip=zip;
	}
	
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number=phone_Number;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email=email;
	}
	}
	
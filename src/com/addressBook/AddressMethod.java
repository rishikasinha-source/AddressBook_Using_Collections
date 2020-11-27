package com.addressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class AddressMethod {
	ArrayList<Address> addressBook = new ArrayList<Address>();

	public void Add() {
		// TODO Auto-generated method stub
		Address address = new Address();
		addressBook.add(address);
	}

	public void Show() {
		// TODO Auto-generated method stub
		Iterator itr = addressBook.iterator();
		while (itr.hasNext()) {
			Address address = (Address) itr.next();
			System.out.println("Name- " + address.getFirst_Name() + " " + address.getLast_Name());
			System.out.println("Address- " + address.getAddress());
			System.out.println("Zip- " + address.getZip());
			System.out.println("Phone Number- " + address.getPhone_Number());
			System.out.println("Email - " + address.getEmail());
		}
	}
		
	}

	
	

	
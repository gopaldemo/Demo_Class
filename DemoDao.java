package com.evoke.dao;

public class DemoDao {

	public void sendUserId(String address,Long user) {
		
		//db call bd push where userid update adress
		System.out.println("User Id is "+user);
	}

	public void sendAddress(String address) {
		System.out.println("address is "+address);
		
	}

	public String getDataFromDataBase() {
		
	// connect to database and fetch data
		String values = "ABC";
		return values;
	}
	
	
	public String getDataFromDataBase1() {
		
		// connect to database and fetch data
			String values = "ABC";
			return values;
		}

}

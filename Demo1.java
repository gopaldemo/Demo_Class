package com.evoke.controller;

import com.evoke.dao.DemoDao;

class Demo1 {
	 
	public static String variableOne = "abc";//class level variable
	
	public String varibaleTwo ="EFG";//Object level variable
	
	public final String dbUser = "DBUser1";
	public final String dbPassword = "password";
	
	
	public String userName;
	
	public String passWord;
	
	Demo1(){
		
	}
	
	Demo1(String userName,String passWord){
		this.userName = userName;
		this.passWord = passWord;
				
	}
	/**
	 * @return noting
	 */
	public void methodOne() {
		varibaleTwo = "1234477ASSSDD";
		System.out.println("Printing methodOne non-static :::" +varibaleTwo);
		System.out.println("Printing methodOne static :::" +variableOne);
	}
	
	public static void methodTwo() {
		System.out.println("Printing methodTwostatic :::" +variableOne);
	}
	
	
	
	public void methodLocalVariables(String address,Long userId) {
		String userName = "gopal";
		System.out.println("methodLocalVariables entring :::");
		DemoDao demoDAO = new DemoDao();
		System.out.println("demoDAO after:::" );
		if(userId == 2L) {
			System.out.println("If condition :::" );
			demoDAO.sendUserId(address,userId);
		}else {
			System.out.println("Else condition :::" );
			demoDAO.sendAddress(address);
		}
		
		System.out.println("methodLocalVariables ending:::" );
	}
	
	
	
	
	public String methodLocalVariablesWithReturn() {
		
		DemoDao demoDAO = new DemoDao();
		String s1 = demoDAO.getDataFromDataBase();
		return s1;
		
	}
	
	
	public void finalVariables() {
	}
	
	
	
	public static void main(String args[]) {
		
		Demo1 demo1 = new Demo1();
//		demo1.methodLocalVariables("Test Adrress", 2L);
		String s1 = demo1.methodLocalVariablesWithReturn();
		System.out.println("Method retuns :::"+s1);
		
		DemoDao demoDAO = new DemoDao();
		String s2 = demoDAO.getDataFromDataBase1();
		System.out.println("Method retuns :::"+s2);
		
		
	}
	
	
	
	
	

}

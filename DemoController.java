package com.evoke.controller;

public class DemoController {


	public static void main(String args[]) {
		
		Demo1 demo1 = new Demo1();
		
		System.out.println("Demoservice to Demo 1 call "+demo1.varibaleTwo);
		demo1.methodOne();
		System.out.println("Demoservice to Demo 1 call "+Demo1.variableOne);
		Demo1.methodTwo();
	}
}

package com.evoke.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.evoke.dto.Account;

public class DemoController {

	public void checkListFunctionality() {
		List<String> addressList = new ArrayList<>();
		System.out.println("*****LIST START*******");
		addressList.add("USA");
		addressList.add("INDIA");
		addressList.add("UK");
		addressList.add("GRN");
		addressList.add("USA");
		for (String address : addressList) {
			System.out.println("address::::"+address);
		}
		System.out.println("*****LIST END*******");
	}
	
	public void checkSetFunctionality() {
		Set<String> addressList = new HashSet<>();
		System.out.println("*****SET START*******");
		addressList.add("USA");
		addressList.add("INDIA");
		addressList.add("UK");
		addressList.add("GRN");
		addressList.add("USA");
		for (String address : addressList) {
			System.out.println("address::::"+address);
		}
		System.out.println("*****SET END*******");
	}
	
	
	public void checkLinkedHashSetFunctionality() {
		Set<String> addressList = new LinkedHashSet<>();
		System.out.println("*****Linked SET START*******");
		addressList.add("USA");
		addressList.add("INDIA");
		addressList.add("UK");
		addressList.add("GRN");
		addressList.add("USA");
		for (String address : addressList) {
			System.out.println("address::::"+address);
		}
		System.out.println("*****LinkedSET END*******");
	}
	
	public void checkHashMAPFunctionality() {
		Map<String,String> addressList = new LinkedHashMap<>();
		System.out.println("*****HASHMAP SET START*******");
		addressList.put("address","USA");
		addressList.put("username","user1");
		addressList.put("username","gopal");
		addressList.put("address","UK");
		Set<Entry<String, String>> entrySet = addressList.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("entry::::"+entry.getValue());
			System.out.println("entry::::"+entry.getKey());
		}
		System.out.println("address::::"+addressList.get("address"));
		System.out.println("username::::"+addressList.get("username"));
		
		System.out.println("*****HASHMAP END*******");
	}
	
	public List<Account> checkListAccountFunctionality() {
		List<Account> accountsList = new ArrayList<>();
		System.out.println("*****LIST START*******");
		Account ac = new Account();
		ac.setAccountAddress("USA");
		ac.setAccountId(1234);
		ac.setAccountName("xyz");
		ac.setActive(true);
		
		
		Account ac1 = new Account();
		ac1.setAccountAddress("USA");
		ac1.setAccountId(1234);
		ac1.setAccountName("xyz");
		ac1.setActive(true);
		
		
		accountsList.add(ac);
		accountsList.add(ac1);
		
		for (Account account : accountsList) {
			System.out.println("address::::"+account.getAccountAddress());
			System.out.println("Name::::"+account.getAccountName());
			System.out.println("ACID::::"+account.getAccountId());
		}
		System.out.println("*****LIST END*******");
		return accountsList;
	}
	
	public static void main(String args[]) {
		DemoController dc = new DemoController();
		dc.checkListFunctionality();
		dc.checkSetFunctionality();
		dc.checkLinkedHashSetFunctionality();
		dc.checkHashMAPFunctionality();
		
		List<Account> checkListAccountFunctionality = dc.checkListAccountFunctionality();
		System.out.println("checkListAccountFunctionality::SIZE:"+checkListAccountFunctionality.size());
	}
}

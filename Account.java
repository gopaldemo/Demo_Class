package com.evoke.dto;

public class Account {

	private String accountName;
	private Integer accountId;
	private String accountAddress;
	private boolean isActive;
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountAddress() {
		return accountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}

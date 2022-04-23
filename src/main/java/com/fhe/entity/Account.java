package com.fhe.entity;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2095112642463318571L;
	private int accountNo;
	private String accountHolderName;
	private String branch;
	private String email;
	private float balance;
	private String mobileNo;

	public Account() {

	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNo, balance, branch, email, mobileNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountHolderName, other.accountHolderName) && accountNo == other.accountNo
				&& Float.floatToIntBits(balance) == Float.floatToIntBits(other.balance)
				&& Objects.equals(branch, other.branch) && Objects.equals(email, other.email)
				&& Objects.equals(mobileNo, other.mobileNo);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", branch=" + branch
				+ ", email=" + email + ", balance=" + balance + ", mobileNo=" + mobileNo + "]";
	}

}

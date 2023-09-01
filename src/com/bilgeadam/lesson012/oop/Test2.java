package com.bilgeadam.lesson012.oop;

public class Test2 {
	
	public static void main(String[] args) {
		
		BankAccount account1=new BankAccount("123A", 2500.50,"X500");
		account1.setBalance(4250);
		
	//	account1.getInformation();
		
		System.out.println(account1.getBalance());
		System.out.println(account1.getBankNo());
		
		
		
		
		
	   BankAccount account2=new BankAccount("568A");
		//account2.balance=558.589;
		account2.getInformation();
//		   BankAccount account3=new BankAccount();
//		   account3.getInformation();
		
		
		
	}

}

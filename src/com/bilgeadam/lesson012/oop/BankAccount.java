package com.bilgeadam.lesson012.oop;
/*
 * bir interestrate acoountnumber bide balance ozelliklerimiz var
 * 
 * bu sınıfı soyutladıkdan sonra bankamız için bir faiz oranı belirliyoruz 0.05 
 * 
 * daha sonra faiz getirsini hesaplayan bir metod yazalım 
 * 
 * birde getInformation metodu yazalım hesap bilgilerimizi yazdıracagız
 * 
 * 
 * 
 * 
 */
public class BankAccount {
	
    static final	double INTEREST_RATE=0.05;
    private  double balance;
   protected String accountNumber;
   private String bankNo;
	
	
	
//	public BankAccount(String hesapNo,double bakiye) {
//		balance=bakiye;
//		accountNumber=hesapNo;
//	}
	
//	
   
   
	
	private BankAccount() {
		this.balance=100;
	}
	public BankAccount(String accountNumber, double balance,  String bankNo) {
	super();
	this.balance = balance;
	this.accountNumber = accountNumber;
	this.bankNo = bankNo;
		}
	public BankAccount(String accountNumber,double balance) {
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	
	public BankAccount(String accountNumber) {
		this();
		this.accountNumber=accountNumber;
	}
	
	
	
	public double faizGetirsiniHesabı(int gun) {
		
		//double gunlukFaizGetirisi2=balance*interestRate;
		double gunlukFaizGetirisi=(balance/100)*(INTEREST_RATE/365)*gun;
		return gunlukFaizGetirisi;
	}
	
	public void getInformation() {
		System.out.println("===Hesap Bilgileri====");
		System.out.println("hesap numarası= "+accountNumber);
		System.out.println("hesap bakiyesi= "+balance);
		System.out.println("faiz oranı= "+INTEREST_RATE);
		System.out.println("1 gunluk faiz getirisi= "+ faizGetirsiniHesabı(1));
	}
	

	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getBankNo() {
	
		return this.bankNo;
	}
	
	
}

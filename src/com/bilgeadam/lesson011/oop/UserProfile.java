package com.bilgeadam.lesson011.oop;

public class UserProfile {

	String username;
	String about;
	int followers;
	int following;
	String avatar;
	int postCount;
	String name;
	String surName;
	
	
	public void editProfile() {
		System.out.println(name+" Profilini düzenledi");
	}
	
	public void createPost() {
		System.out.println("Post olusturuldu");
		postCount+=1;
		
	}
	
	public void shareStory() {
	
		System.out.println("Hikaye olusturuldu");
	}
	
	public void  addFriend() {
		System.out.println("Takip edildi");
		following+=1;
	}
	
	
	public void getInformation() {
		
		System.out.println("=====Profil Bilgileri=====");
		System.out.println("isim soy isim= "+name+" "+ surName);
		System.out.println("kullanıcı ismi= "+username);
		System.out.println("postsayısı= "+ postCount);
		System.out.println("takipci sayısı= "+ followers);
		System.out.println("takip sayısı= "+ following);
		System.out.println("============================");
		
		
		
	}
	
	
	
}

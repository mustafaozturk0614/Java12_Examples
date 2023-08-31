package com.bilgeadam.lesson011.oop;

public class Test {
	
	public static void main(String[] args) {
		
		UserProfile profile1= new UserProfile();
		profile1.name="Mustafa";
		profile1.surName="Öztürk";
		profile1.username="musty";
		profile1.followers=224;
		profile1.following=310;
		profile1.postCount=120;
		
		System.out.println(profile1.name);
		System.out.println(profile1.surName);
		System.out.println(profile1.username);
		System.out.println(profile1.followers);
		System.out.println(profile1.following);
		System.out.println(profile1.postCount);
		
	//	profile1.editProfile();
	//	profile1.createPost();;
	//	profile1.addFriend();;
	//	profile1.getInformation();
		
		System.out.println("////////////////////////////");
		System.out.println(profile1);
		
		UserProfile profile2= new UserProfile();
		profile2.name="Mustafa";
		profile2.surName="Öztürk";
		profile2.username="musty";
		profile2.followers=224;
		profile2.following=310;
		profile2.postCount=120;
		
		
		System.out.println(profile1.equals(profile2));
		System.out.println(profile1==profile2);
		System.out.println(profile1);
		System.out.println(profile2);

		System.out.println(profile1.name.equals(profile2.name));
		
		UserProfile profile3=new UserProfile();
		profile3=profile2;
		System.out.println(profile3);
		profile3.postCount=800;
		System.out.println(profile2.postCount);
		System.out.println(profile3.equals(profile2));
		System.out.println(profile3 == (profile2));
	}

}

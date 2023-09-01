package com.bilgeadam.lesson012.staticOrnek;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student ogrenci1=new Student();
		ogrenci1.name="Mustafa";
		ogrenci1.numaraVer();
		
		Student ogrenci2=new Student();
		ogrenci2.name="Hilal";
		ogrenci2.numaraVer();
		
		Student ogrenci3=new Student();
		ogrenci3.name="Elif";
		ogrenci3.numaraVer();
		
		
		System.out.println(ogrenci1.studentNumber);
		System.out.println(ogrenci2.studentNumber);
		System.out.println(ogrenci3.studentNumber);
		
		
	}

}

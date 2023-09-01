package com.bilgeadam.lesson012.staticOrnek;
/*
 *   öğrencilerimizin bir numarası ve bir isimi olsun 
 * 
 *  daha sonra kayıt metodu yazalım 
 *  kayıt ol metodu bize ogrenci numarası atasın sırayla
 *	Mustafa adlı ogrenci basarı ile kayıt edildi ogrencı numarası 1 
 *	Serkan adlı ogrenci basarı ile kayıt edildi ogrencı numarası 2 
 * 	
 * 
 * 
 * ogrenciKayit2 metodu dıaşrıdan isim bilgisi alsın ogrencimizi olusturp daha sonra numarasını atasın 
 * ve biz bir ogrenci donsun;
 * 
 */
public class Student {
	
	
	 String name;
	 int studentNumber;
	 static int index;
	
	
	public void numaraVer() {
		index++;
		studentNumber=index;
		System.out.println("=================");
		System.out.println(name+" adlı ogrenci basarı ile kayıt edildi ogrencı numarası: "+studentNumber);
		System.out.println("=================");
	}
	
	
	
	public static Student ogrenciKayit2(String isim) {
		Student student=new Student();
		student.name=isim;
		student.numaraVer();
		return student;
	}
	

}

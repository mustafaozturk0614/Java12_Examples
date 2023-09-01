package com.bilgeadam.lesson012.staticOrnek;

public class StudentTest2 {
	
	public static void main(String[] args) {
		
		Student student1=Student.ogrenciKayit2("Mustafa");
		Student student2=Student.ogrenciKayit2("Ali");
		
		System.out.println(student1.name+"===>"+ student1.studentNumber);
		System.out.println(student2.name+"===>"+ student2.studentNumber);
		
	}

}

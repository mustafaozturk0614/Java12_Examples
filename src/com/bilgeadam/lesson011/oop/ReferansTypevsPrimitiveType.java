package com.bilgeadam.lesson011.oop;

public class ReferansTypevsPrimitiveType {
	
	
			
			public static void main(String[] args) {
				int a=5;
				int b=4;
				
				
				
				System.out.println(a);
				System.out.println(b);
				a=b;
				b=12;
				
				System.out.println(a);//4-12
				System.out.println(b);//12-12
				
				Integer sayi1=10;
				Integer sayi2=20;
				sayi1=sayi2;
				sayi2=30;
				System.out.println("//////////////////////");
				System.out.println(sayi1);
				System.out.println(sayi2);
						
				
				String [] sehirler= {"Ankara","Istanbul","İzmir"};
				String [] sehirler2= {"Bursa","Konya","Mersin"};
				System.out.println("//////////////////////");
				System.out.println(sehirler[0]);
				System.out.println(sehirler2[0]);
				System.out.println("//////////////////////");
				
				sehirler2=sehirler;
				System.out.println(sehirler2[0]);//Ankara 
				
				sehirler[0]="Bolu";
				System.out.println(sehirler2[0]);//Bolu
				
				sehirler2[1]="Edirne";
				System.out.println(sehirler[1]);// Edirne
				
				
				
			}

}

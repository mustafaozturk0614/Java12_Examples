package com.bilgeadam.lesson012.staticOrnek;

public class StaticOrnek {
	
	int number1;
	static int number2;
	
	
	public void numaraVer() {
		
		System.out.println("Numara ver metodu");
		number1+=1;
		number2+=1;
		System.out.println("number1====>"+number1);
		System.out.println("number2====>"+number2);
	
	}
	
	
	
	 public static void numaraVer2() {
		System.out.println("Numara ver 2  metodu");
		number2+=1;
//		number1+=1;
//		System.out.println("number1====>"+number1);   static bir metod içinde static olmayan bir özelleik direk 
													//olarak kullanılmaz bunun için nesne olustmak gerekir
		System.out.println("number2====>"+number2);
				
	}
	 
	 
	 public static void main(String[] args) {
		 
		number2=5;
		StaticOrnek.number2=10;	
		StaticOrnek nesne=new StaticOrnek();
		nesne.number1=10;
		System.out.println(number2);
		System.out.println(nesne.number1);
		
		nesne=new StaticOrnek();
		//nesne.number1=0;
		
		
		System.out.println(number2);//10
		System.out.println(nesne.number1);//0
		
		nesne.numaraVer();
		nesne.numaraVer();
		//nesne.number1=2;
		//StaticOrnek.number2=12
		
		StaticOrnek nesne2=new StaticOrnek();
		//nesne2.number1=0;
		//StaticOrnek.number2=12
		
		System.out.println(nesne2.number1);//0
		System.out.println(nesne.number1);//2
		
		System.out.println(nesne2.number2);//12
		System.out.println(nesne.number2);//12
		
		
		//com.bilgeadam.lesson012.staticOrnek.StaticOrnek.number2
		
		
		numaraVer2();
	StaticOrnek.numaraVer2();
	nesne.numaraVer();
	nesne2.numaraVer();
	System.out.println("///////////////////////////////////");
	System.out.println(nesne2.number1);//1
	System.out.println(nesne.number1);//3
	
	System.out.println(nesne2.number2);//16
	System.out.println(nesne.number2);//16
	System.out.println(StaticOrnek.number2);
	System.out.println(number2);
		
	}
	

}

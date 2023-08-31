package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;

/*
 * bu sınıf içinde bir arrayimiz olsun bu array secenekler arrayi
 * 
 * [TAS,KAGIT,MAKAS]
 * 
 * pc secim yapsın random bir index uretip burdaki arrayimizden bir tane veri ceksin 
 * 
 * 
 * secimYap() metodu yazacağız önce arrayimizi yazdıralım kullanıcı neyi seceğini gorsun 
 * 1-Tas
 * 2-Kagıt
 * 3-Makas
 * daha sonra burdan bir secim yapsın ve metot bize bu secimi geri donsun 
 * 
 */



public class TasKagıtMakas {
	
 static String [] secenekler= {"TAS","KAGIT","MAKAS"}; 
	
static Scanner scanner=new Scanner(System.in);	
	
	
	public static String pcSecim() {
		Random random=new Random();
		int index=random.nextInt(secenekler.length);
		return  secenekler[index];
	}
	
	
	public static String secimYap() {
		
		for (int i = 0; i < secenekler.length; i++) {
			
			System.out.println((i+1)+"-"+secenekler[i]);
		}
		
//		System.out.println("Lütfen bir Seçim yapınız...");
//		int secim= scanner.nextInt();
//		
//		return secenekler[secim-1];
		
		int secim=secimKontrol();
		
		return  secenekler[secim-1];
	}


	public static int secimKontrol() {
		
		int secim=0;
		while(secim<1||secim>3) {
			System.out.println("Lütfen 1-3 arası bir seçim yapınız...");
			secim=scanner.nextInt();
		}
		
		return secim;
	}
	
	public static void oyun(   ) {
		/*
		 * 1-pc secim yapacak
		 * 2-kullanıcı secim yapacak
		 * 3-bu iki secimi kontrol edeceğiz ve kazandınız kaybbetniz ve beraberlik cıktılarından birini yazdıracagız 
		 *  kullanıcı==>Tas pc==> Kagıt ==> Kaybettiniz
		 *  kullanıcı==>Tas pc==> Makas ==> Kazandınız
		 */
		String pcSecim=pcSecim();
		String secimim=secimYap(); 
		 
		System.out.println("pc Secim==>"+pcSecim);
		System.out.println("kullanıcı secimi=>"+secimim);
		
		if (pcSecim.equals(secimim)) {
			System.out.println("Beraberlik...");
		}else {
			switch (secimim) {
			case "TAS":
				if (pcSecim.equals("KAGIT")) {
					System.out.println("KAYBETTİNİZ");
				}else {
					System.out.println("KAZANDINIZ");
				}
				break;
			case "KAGIT":
				if (pcSecim.equals("MAKAS")) {
					System.out.println("KAYBETTİNİZ");
				}else {
					System.out.println("KAZANDINIZ");
				}
				
			case "MAKAS":
				if (pcSecim.equals("TAS")) {
					System.out.println("KAYBETTİNİZ");
				}else {
					System.out.println("KAZANDINIZ");
				}				
				break;
			default:
				break;
			}
			
		}
		
		
		
	}
	
	
	
}

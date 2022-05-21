import java.util.Scanner;

public class Proje4Hesapmakinesi {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sayi1,sayi2,secim;
		System.out.println("Ýlk Sayýyý Giriniz :");
		sayi1= scan.nextInt();
		System.out.println("\nÝkinci Sayýyý Giriniz :");
		sayi2=scan.nextInt();
		System.out.println("\nLütfen Yapýlacak Ýþlemi Seçin");
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz :");
		secim=scan.nextInt();
		
		
		if (secim==1) {
			
			System.out.println("Sonuç :"+(sayi1+sayi2));
		}
		else if (secim==2) {
			
			System.out.println("Sonuç :" + (sayi1-sayi2));
		}
		else if (secim==3) {
			System.out.println("Sonuç : " + (sayi1*sayi2));
		}
		else if (secim == 4) {
			
			System.out.println("Sonuç : " + (sayi1/sayi2));
		}
		else {
			
			System.out.println("Lütfen Geçerli Bir Ýþlem Seçiniz2");
			
		}
	}

}

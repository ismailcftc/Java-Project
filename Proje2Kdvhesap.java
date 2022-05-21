import java.util.Scanner;

public class Proje2Kdvhesap {

	public static void main(String[] args) {

		 double ucret,kdvlifiyat;
		 double kdv = 0.18;
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ürünün Tutarýný Giriniz : ");
		ucret = input.nextDouble();
		kdvlifiyat = ucret + (ucret*kdv);
		System.out.println( "Ürünün Kdvli Fiyatý : " + kdvlifiyat);
		 
	}

}

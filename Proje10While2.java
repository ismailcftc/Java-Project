import java.util.Scanner;

public class Proje10While2 {

	public static void main(String[] args) {

		
	/*	System.out.println("Faktoriyel Say�s� Giriniz :");
		 int f = scan.nextInt();
		 
		 int sonuc = 1;
		 
		 while (f > 0 ) {
			 sonuc *= f;
			 f--;
		 }
		 System.out.println(sonuc);  
		 
		 */

		/*
		System.out.println("Harmonik say�y� giriniz : ");
		double h = scan.nextDouble();
		double harmonic = 0.0;
		while(h > 0) {
			harmonic = harmonic +1/h;
			h--;
			
		}
		System.out.println(harmonic);
		*/
	
		
		/*
		  Scanner scan = new Scanner(System.in);
		

		
		int star = scan.nextInt();
		
		int i=1;
		while (i <= star) {
			
			int k = 1;
			 while (k <= i) {
				 System.out.println("*");
				 k++;
				 System.out.println();
				 i++;
			 }
			 
		}    */
	
		
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2, sonuc=1;
		System.out.println("�ss� al�nacak sayi :");
		sayi1 = scan.nextInt();
		System.out.println("�s olacak sayi :");
		sayi2 = scan.nextInt();
		
		int i=1;
		while (i <= sayi2) {
			
			sonuc = sonuc * sayi1;
			i++;
		}
		
		System.out.println("Sonuc :" + sonuc);
	}

}


import java.util.Scanner;

public class Proje6SnýfGecme {

	public static void main(String[] args) {
		
		int tr,mat,fen,sos,beden;
		double ort;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("************ Hosgeldiniz ************");
		
		System.out.print("\nTürkçe Ortalamanýzý Giriniz :");
		tr = scan.nextInt();
		while (tr > 100) {
			System.out.println("Lütfen Doðru Deðer Giriniz");
		
			System.out.print("\nTürkçe Ortalamanýzý Giriniz :");
			tr = scan.nextInt();
		}
		
		System.out.print("\nMatematik Ortalamanýzý Giriniz :");
		mat = scan.nextInt();
		while (mat > 100) {
			System.out.println("Lütfen Doðru Deðer Giriniz");
		
			System.out.print("\nMatematik Ortalamanýzý Giriniz :");
			mat = scan.nextInt();
		}
		
		
		System.out.print("\nFen Ortalamanýzý Giriniz :");
		fen = scan.nextInt();
		while (fen > 100) {
			System.out.println("Lütfen Doðru Deðer Giriniz");
		
			System.out.print("\nFen Ortalamanýzý Giriniz :");
			fen = scan.nextInt();
		}
		
		
		System.out.print("\nSosyal Ortalamanýzý Giriniz :");
		sos= scan.nextInt();
		while (sos > 100) {
			System.out.println("Lütfen Doðru Deðer Giriniz");
		
			System.out.print("\nSosyal Ortalamanýzý Giriniz :");
			sos = scan.nextInt();
		}
		
		System.out.print("\nBeden Ortalamanýzý Giriniz :");
		beden = scan.nextInt();
		while (beden > 100) {
			System.out.println("Lütfen Doðru Deðer Giriniz");
		
			System.out.print("\nBeden Ortalamanýzý Giriniz :");
			beden = scan.nextInt();
		}
		
		ort = (tr+mat+fen+sos+beden)/5; 
		
		
		
{
}
		if (ort < 50) {
			
			System.out.println("Sýnýfý Geçemediniz Tekrar Denemeye Hak Kazandýnýz...");
			System.out.println(ort);

	}
		
		else {
			
			System.out.println("Sýnýfý Geçtiniz Tebrikler...");
			System.out.println(ort);

			
		}
		
		
		
	}}
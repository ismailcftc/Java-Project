
import java.util.Scanner;

public class Proje6Sn�fGecme {

	public static void main(String[] args) {
		
		int tr,mat,fen,sos,beden;
		double ort;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("************ Hosgeldiniz ************");
		
		System.out.print("\nT�rk�e Ortalaman�z� Giriniz :");
		tr = scan.nextInt();
		while (tr > 100) {
			System.out.println("L�tfen Do�ru De�er Giriniz");
		
			System.out.print("\nT�rk�e Ortalaman�z� Giriniz :");
			tr = scan.nextInt();
		}
		
		System.out.print("\nMatematik Ortalaman�z� Giriniz :");
		mat = scan.nextInt();
		while (mat > 100) {
			System.out.println("L�tfen Do�ru De�er Giriniz");
		
			System.out.print("\nMatematik Ortalaman�z� Giriniz :");
			mat = scan.nextInt();
		}
		
		
		System.out.print("\nFen Ortalaman�z� Giriniz :");
		fen = scan.nextInt();
		while (fen > 100) {
			System.out.println("L�tfen Do�ru De�er Giriniz");
		
			System.out.print("\nFen Ortalaman�z� Giriniz :");
			fen = scan.nextInt();
		}
		
		
		System.out.print("\nSosyal Ortalaman�z� Giriniz :");
		sos= scan.nextInt();
		while (sos > 100) {
			System.out.println("L�tfen Do�ru De�er Giriniz");
		
			System.out.print("\nSosyal Ortalaman�z� Giriniz :");
			sos = scan.nextInt();
		}
		
		System.out.print("\nBeden Ortalaman�z� Giriniz :");
		beden = scan.nextInt();
		while (beden > 100) {
			System.out.println("L�tfen Do�ru De�er Giriniz");
		
			System.out.print("\nBeden Ortalaman�z� Giriniz :");
			beden = scan.nextInt();
		}
		
		ort = (tr+mat+fen+sos+beden)/5; 
		
		
		
{
}
		if (ort < 50) {
			
			System.out.println("S�n�f� Ge�emediniz Tekrar Denemeye Hak Kazand�n�z...");
			System.out.println(ort);

	}
		
		else {
			
			System.out.println("S�n�f� Ge�tiniz Tebrikler...");
			System.out.println(ort);

			
		}
		
		
		
	}}
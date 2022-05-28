import java.util.Scanner;

public class Proje13Fibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi Giriniz : ");
		int input = scan.nextInt();
		
		int s1 = 0;
		int s2 = 1;
		int toplam;
		
		
		
		for (int i = 0 ; i<= input ; i++) {
			
			
			System.out.print(s1+" , ");
			toplam = s1+s2;
			s1 = s2;
			s2 = toplam;
		
		}
	}

}

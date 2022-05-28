import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	/*	int input , toplam = 0;
		while (true) {
			System.out.println("Lütfen Sayi Giriniz : ");
			input = scan.nextInt();
			
			if (input<0) {
				System.out.println("Program Bitti Negatif Sayi Girdiniz !! ");
				break;
				
			}
			
			if (input % 2 == 1) {
				
				
				System.out.println("Girilen tek sayilar toplami : " +toplam);
				
			}
			*/
		
		int input,toplam=0;
		
		do {
			System.out.print("Lutfen Sayi Giriniz : ");
			input = scan.nextInt();
			if(input %2==0) {
				toplam += input;
				
			}
		}
		
		while (input > 0); 
		System.out.println("Girilen tek sayilar toplami : " +toplam);
			
		}
		
		
	}



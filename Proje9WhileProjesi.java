import java.util.Scanner;

public class Proje9WhileProjesi {

	public static void main(String[] args) {

		
	/*	int i = 1;
		while (i<= 100) {
			if (i % 2 == 0) {
				
				System.out.println(i);
			}
			i++;
		}    */
		
		
	/*	Scanner scan = new Scanner(System.in);
		int toplama = 0;
		int input;
		
		while (true) {
			
			System.out.println("Lütfen sayi giriniz:");
			input = scan.nextInt();
			 if (input <0 ) {
				 System.out.println("Program bitti negatif sayi girdiniz !");
				 break;

			 }

			 if (input % 2 == 1) {
				 
				 toplama += input;
			 }
			 
		}
		
		System.out.println("Girilen tek sayilarin toplami : "+ toplama);
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý Giriniz :");
		int input = scan.nextInt();
		int k = 1;
		while (k <= input) {
			
			System.out.println(k);
			
			k = k*2;
		}
		
		
		
		
		
		
		
	}

}

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayý giriniz : ");
		
		int sayi = scan.nextInt();
		
		switch (sayi) {
		
		case 1:
			System.out.println("Sayý 1e Eþittir");
			break;
		case 2:
			System.out.println("Sayý 2ye Eþittir");
			break;
		case 3:
			System.out.println("Sayý 3e Eþittir");
			break;
			
			default :
				System.out.println("Geçersiz bir sayý girdiniz");
		}
		
	}

}

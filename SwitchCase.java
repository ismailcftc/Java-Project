import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Say� giriniz : ");
		
		int sayi = scan.nextInt();
		
		switch (sayi) {
		
		case 1:
			System.out.println("Say� 1e E�ittir");
			break;
		case 2:
			System.out.println("Say� 2ye E�ittir");
			break;
		case 3:
			System.out.println("Say� 3e E�ittir");
			break;
			
			default :
				System.out.println("Ge�ersiz bir say� girdiniz");
		}
		
	}

}

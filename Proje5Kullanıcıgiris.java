import java.util.Scanner;

public class Proje5Kullan�c�giris {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String k_adi,parola;
		System.out.println("Kullan�c� Ad� Giriniz : ");
		k_adi = scan.nextLine();
		System.out.println("Parolan�z� Giriniz : ");
		parola = scan.nextLine();
		
		if (k_adi.equals("iso") && parola.equals("123"))  {
			
			System.out.println("Ba�ar�l� �ekilde Giri� Yapt�n�z");
		}
		
		else {
			
			System.out.println("Kullan�c� Ad� Veya �ifre Yanl��");
		}
	}

}

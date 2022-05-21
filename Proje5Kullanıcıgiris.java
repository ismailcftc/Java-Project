import java.util.Scanner;

public class Proje5Kullanýcýgiris {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String k_adi,parola;
		System.out.println("Kullanýcý Adý Giriniz : ");
		k_adi = scan.nextLine();
		System.out.println("Parolanýzý Giriniz : ");
		parola = scan.nextLine();
		
		if (k_adi.equals("iso") && parola.equals("123"))  {
			
			System.out.println("Baþarýlý Þekilde Giriþ Yaptýnýz");
		}
		
		else {
			
			System.out.println("Kullanýcý Adý Veya Þifre Yanlýþ");
		}
	}

}

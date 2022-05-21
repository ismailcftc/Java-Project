import java.util.Scanner;

public class Proje8Etkinlikprogrmý {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sicaklik;
		 System.out.println("Hava Sýcaklýðýný Giriniz : ");
		sicaklik = scan.nextInt();
		
		if (sicaklik >=30 ) {
			System.out.println("Bu havada yüzmeye gidilir");
		}
		else if (sicaklik <= 30 && sicaklik >= 5) {
			System.out.println("Bu havada Sinema Süper Olur");
			
		}
		
		else {
			System.out.println("Bu havada en iyi Kayaða gidilir.");
			
		}
		
		
	}

}

import java.util.Scanner;

public class Proje8Etkinlikprogrm� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sicaklik;
		 System.out.println("Hava S�cakl���n� Giriniz : ");
		sicaklik = scan.nextInt();
		
		if (sicaklik >=30 ) {
			System.out.println("Bu havada y�zmeye gidilir");
		}
		else if (sicaklik <= 30 && sicaklik >= 5) {
			System.out.println("Bu havada Sinema S�per Olur");
			
		}
		
		else {
			System.out.println("Bu havada en iyi Kaya�a gidilir.");
			
		}
		
		
	}

}

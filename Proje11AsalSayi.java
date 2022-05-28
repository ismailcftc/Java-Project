import java.util.Scanner;

public class Proje11AsalSayi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		boolean asal = true;
		do {
			
			System.out.println("Pozitif bir sayi giriniz : ");
			input = scan.nextInt();
		}
		
		while(input < 2);
		
		for(int i=2; i < input; i++) {
			
			if(input%i==0) {
				
				asal = false;
				break;
			}
			
		}
		
		if (asal) {
			
			System.out.println("Girilen sayi : "+input+" Asaldýr");
		}
		else {
			
			System.out.println("Girilen sayi : "+input+" Asal Deðildir.");
		}
	}

}

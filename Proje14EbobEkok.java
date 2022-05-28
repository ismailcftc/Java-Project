import java.util.Scanner;

public class Proje14EbobEkok {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		 int s1 , s2 , obob=1,ekok;

		 System.out.println("Lütfen Sayýlarý Giriniz :");
		 s1 = scan.nextInt();
		 s2= scan.nextInt();
		
		int min = (s1<s2) ? s1 : s2;
		
		for (int i = min ; i > 0; i--) {
			
			if ((s1 %i==0) && (s2%i ==0)) {
				
				obob = i;
				break;
				
			}
			
		}
		
		ekok = (s1*s2) / obob;
		System.out.println(s1 + " ve " + s2 + "Sayilarin Ekoku " + ekok);
		System.out.println(s1 + " ve " + s2 + "Sayilarin Ebobu " + obob);
		
		
		
		
	}

}

import java.util.Scanner;

public class Proje4Hesapmakinesi {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sayi1,sayi2,secim;
		System.out.println("�lk Say�y� Giriniz :");
		sayi1= scan.nextInt();
		System.out.println("\n�kinci Say�y� Giriniz :");
		sayi2=scan.nextInt();
		System.out.println("\nL�tfen Yap�lacak ��lemi Se�in");
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iminiz :");
		secim=scan.nextInt();
		
		
		if (secim==1) {
			
			System.out.println("Sonu� :"+(sayi1+sayi2));
		}
		else if (secim==2) {
			
			System.out.println("Sonu� :" + (sayi1-sayi2));
		}
		else if (secim==3) {
			System.out.println("Sonu� : " + (sayi1*sayi2));
		}
		else if (secim == 4) {
			
			System.out.println("Sonu� : " + (sayi1/sayi2));
		}
		else {
			
			System.out.println("L�tfen Ge�erli Bir ��lem Se�iniz2");
			
		}
	}

}

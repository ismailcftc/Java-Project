import java.util.Scanner;

public class Proje7U�akBileti {

	public static void main(String[]args) {
		
		
	Scanner scan = new Scanner(System.in);
		
	int km, yas,tip;
	System.out.print("Mesafeyi Giriniz :");
	km=scan.nextInt();
	
	System.out.print("\nYa��n�z� Giriniz :");
	yas= scan.nextInt();
	
	System.out.println("\nYolculuk Tipini Se�iniz  (1-Gidi�     2-Gidi� D�n�� )");
	tip = scan.nextInt();
	
	double normalfiyat = km*0.10 , yasindirimi , tipindirimi ;
	
	if(km>0 && yas > 0 && (tip==1 || tip ==2))  {
		normalfiyat= km * 0.10;
	}
	else  {
		
		System.out.println("Girdiler Eksik Veya  Yanl�� !");
	}
	if(yas<12) {
		yasindirimi = normalfiyat * 0.5;
		normalfiyat= normalfiyat - yasindirimi;
	}
	
	else if (yas >=12 && yas <= 24) {
		 
		yasindirimi=normalfiyat*0.10;
		normalfiyat= normalfiyat-yasindirimi;
	}
	
	else if (yas >= 65) {
		yasindirimi = normalfiyat*0.30;
		normalfiyat=normalfiyat-yasindirimi;
	}
	
	else {
		
		yasindirimi = 0;
		
	}
	if (tip==2) {
		tipindirimi = normalfiyat*0.20;
		normalfiyat=(normalfiyat -tipindirimi)*2;
		
		
	} if (km>0 && yas > 0 && (tip==1 || tip ==2)) {	System.out.println("Bilet Tutar� : "+ normalfiyat+"$");
}
	
	}
	
}

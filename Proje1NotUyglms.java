import java.util.Scanner;

public class Proje1NotUyglms {

	public static void main(String[] args) {
	int quiz,vize,finals;
	double ortalama;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Quiz Notunuzu Giriniz :");
	quiz = input.nextInt();
	System.out.println("Vize Notunuzu Giriniz :");
	vize = input.nextInt();
	System.out.println("Final Notunuzu Giriniz :");
	finals = input.nextInt();
	
	ortalama = (quiz * 0.2 ) + (vize*0.35) + (finals*0.45);

	System.out.println("Not Ortalamanýz :"+ ortalama);
	
	String sonuc = (ortalama >= 50) ? "Geçtiniz :)" : "Kaldýnýz :( ";
	System.out.println(sonuc);
	}

}

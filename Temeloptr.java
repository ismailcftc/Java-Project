
public abstract class Temeloptr {

	public static void main(String[] args) {
		int a=15;
		int b = 5;
		int topla = a+b ;
		int c�kar = a-b;
		int carp = a*b;
		int bol = a/b;
		int mod = a%b;
		 System.out.println(topla);
		 System.out.println(c�kar);
		 System.out.println(carp);
		 System.out.println(bol);
		 System.out.println(mod);
		 
		 topla++;
		 System.out.println(topla);
		 c�kar--;
		 System.out.println(c�kar);
		 
		 
		 int sonuc = a++ + b--;
		 System.out.println(sonuc);
		 
		 
		 
		 int sayi1= 10;
		 int sayi2= 5;
		 
		 boolean kosul= (sayi1>sayi2);
		 
		 System.out.println(kosul);
		 
		 
		 
		 boolean kosul1 = (sayi1>sayi2);
		 boolean kosul2 = (sayi1<sayi2);
		 
		 boolean sonuc2 = (kosul1 && kosul2);
		 System.out.println(sonuc2);
		 
		 
		 sonuc2=(kosul1 || kosul2) ;
		 System.out.println(sonuc2);
		 
		String  sonuc3= (a==b) ? "Do�ru" : "Yanl��";
		System.out.println(sonuc3);
		 
		 
		 
	}

}

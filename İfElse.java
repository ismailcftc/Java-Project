
public class ifElse {

	public static void main(String[]args) {
		
		
		int a = 20 , b=50 , c = 50;
		
		/*
		if (a==b) {
			
			System.out.println("A ve B E�it");
			
		}
		
		else {
			
			
			System.out.println("A vr B say�lar� E�it De�il");
		}
		*/
		
		
	/*	if (b==c) {
			
			System.out.println("B Ve C E�ittir");
		}
		
		else if (a>c) {
			
			System.out.println("A b�y�kt�r C den");
		}
		
		else {
			
			System.out.println("B ve C E�it De�il");
		}
		*/
		
		
		
		if ((a<c) && (a<b)){
			System.out.println("A en k���k Say�d�r");
		}
		else if ((c<a) && (c<b)) {
			
			System.out.println("C en k���k say�d�r");
		}
		else {
			
			System.out.println("B en k���k say�d�r");
		}
	}
}

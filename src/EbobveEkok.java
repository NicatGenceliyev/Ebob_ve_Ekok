import java.util.Scanner;
public class EbobveEkok {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.print("1.Rakam: ");
		a = scan.nextInt();
		
		System.out.print("2.Rakam: ");
		b = scan.nextInt();
		
		System.out.print("1.Ebob\n2.Ekok\nHangisi:");
		int cevap = scan.nextInt();
		
		switch(cevap) {
		case 1:
			Ebob(a, b);
			break;
		case 2:
			Ekok(a, b);
			break;
		}
	}
	
	public static void Ebob (int a, int b) {
		int sonuc = 0;
		for (int i = 1; i < Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				sonuc = i;
			}
		}
		System.out.println("Ebob("+a+";"+b+") = " + sonuc);
	}
	
	public static void Ekok (int a, int b) {
		int sonuc = 0;
		for (int i = Math.max(a, b) * 2; i > Math.min(a, b); i--) {
			if (i % a == 0 && i % b == 0) {
				sonuc = i;
			}
		}
		System.out.println("Ekok("+a+";"+b+") = " + sonuc);
	}

}

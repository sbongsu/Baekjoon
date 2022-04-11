import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int h = scan.nextInt();
		int m = scan.nextInt() + scan.nextInt();
		
		while(m > 59) {
			h++;
			m = m - 60;
		}
		if(h > 23) {
			h = h -24;
		}
		System.out.println(h + " " + m);
	}

}
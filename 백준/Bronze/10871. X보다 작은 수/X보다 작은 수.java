import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i = 1;  i <= num ; i++) {
			int num3 = sc.nextInt();
			if(num2 > num3) {
				System.out.println(num3);
			}
		}
	}
}
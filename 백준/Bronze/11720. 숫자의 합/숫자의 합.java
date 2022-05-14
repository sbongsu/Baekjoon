import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String a = in.next();
		int sum = 0;

		for (int i = 0; i < num; i++) {
			
			sum += a.charAt(i) - '0';

		}
		System.out.println(sum);
	}
}
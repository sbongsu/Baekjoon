import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int copy = A;
		int count = 0;
		int sum = 0;
		
		while (true) {
			int a = (copy%100)/10;
			int b = copy%10;
				
			sum = a+b;
			copy = (b*10) + (sum%10);
				
			count+=1;
				 
			if(A == copy) {
				System.out.println(count);
				break;
			}
		}
		
	}
}
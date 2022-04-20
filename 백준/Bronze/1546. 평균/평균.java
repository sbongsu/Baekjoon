import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		double[] list = new double[count];
		double sum= 0;
		double max= 0;
		
		for(int i = 0; i < count; i++) {
			double a = sc.nextDouble();
			list[i] = a;
		}
		
		for(int j = 0; j < count; j++) {
			if(list[j] > max) {
				max = list[j];
			}
		}
		
		for(int a = 0; a < count; a++) {
			list[a] = list[a]/max*100;
		}
		
		for(int b = 0; b < count; b++) {
			sum = list[b] + sum;
		}
		
		System.out.println(sum/count);

	
	}
}
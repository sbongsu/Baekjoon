import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int num = A * B * C;
		int[] arr = new int[10];
		String num2 = Integer.toString(num);
		String[] stringarr= num2.split("");
		
		for(int i = 0; i <stringarr.length; i++) {
			arr[Integer.parseInt(stringarr[i])]+=1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
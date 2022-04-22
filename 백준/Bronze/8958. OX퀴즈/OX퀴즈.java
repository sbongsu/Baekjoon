import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		for(int j = 0; j < arr.length; j++) {
			int num = 0;
			int sum = 0;
			for(int k = 0; k < arr[j].length(); k++) {
				if(arr[j].charAt(k) == 'O') {
					num++;
					sum +=num;
				}
				else {
					num = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
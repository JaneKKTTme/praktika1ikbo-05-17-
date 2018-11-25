import java.util.Scanner;

public class Task {
	public static int recursion(int max) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		if (number == 0) {
			return max;
		}	
		if (number > max)
			max = number;
		return recursion(max);
	}
	
	public static void main(String[] args) {
		System.out.println("Result: " + recursion(0));
	}
}

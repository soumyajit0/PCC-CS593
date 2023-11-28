
/**

Write a Java program to input n and add n number of integers. In case of InputMismatchException, display "ERROR". Click here for a sample program for handling this type of exceptions.



Avoid using any input or output prompts.

For example:

Input	
3
10 20 5

Result
35


*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num, sum = 0;
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			try {
				num = sc.nextInt();
				sum += num;
			} catch (InputMismatchException e) {
				System.out.println("ERROR");
				System.exit(0);
			}
		}
		System.out.println("Result\n" + sum);
	}
}

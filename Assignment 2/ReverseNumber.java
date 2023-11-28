
/**
Write a Java program to input a number and display the reverse of that number.
  
Input	
173
  
Result
371

*/

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		int temp = number, res = 0;
		while (temp > 0) {
			res = (res * 10) + (temp % 10);
			temp /= 10;
		}
		System.out.println(res);
		sc.close();
	}
}

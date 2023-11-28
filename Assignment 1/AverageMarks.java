
/**
Write a Java program to input marks in two courses and display their average after ignoring the fractional parts (if any).
Ensure to declare the main class as public. BTW, main class is the class having main() method.

Input	
50 31

Result
40

*/

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int course1, course2, average;
		course1 = sc.nextInt();
		course2 = sc.nextInt();
		average = (course1 + course2) / 2;
		System.out.println(average);
		sc.close();
	}
}

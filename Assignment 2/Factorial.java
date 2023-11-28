
/**

Write a Java method fact(int n) for returning factorial value for small n within 20.

Avoid writing a full program / class or main() method or error handling for this simple program.

Notes:

1. Display output as instructed and as given in the example (if any). Avoid displaying extra characters or input / output prompts 
while taking input or displaying output, which are otherwise needed for an interactive program.


2. Ensure to indent all programs properly for readbaility. Under curly braces (blocks), ensure to start each line with TAB character(s). 
Please also ensure to write 1-2 comments in small programs and more while writing medium to large programs. 

3. Powered with Programming Assistant Grading Assistant (PAGA) solution for automatically checking your assignments. Press "Check" only when you are ready.
For example:

Test	   Result
fact(5)  120

*/

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	public static long fact(int n) {
		if (n < 0) {
			return -1;
		}
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}

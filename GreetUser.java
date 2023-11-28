/**

Write a Java program to input user's name and greet the user as stated in the example. 
Study the given partial code, fill-in the required code and apply your understanding in solving the next problem.

Ensure to declare the main class as public. Obviously, main class is the class with main() method.

Input	
Mr. James Gosling

Result
Hello Mr. James Gosling!

*/

import java.util.Scanner;
public class GreetUser
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String user;
		user=sc.nextLine();
		System.out.println("Hello "+user+"!");
		sc.close();
	}
}

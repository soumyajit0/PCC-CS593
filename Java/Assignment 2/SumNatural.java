/**
Write a Java program to input a natural number (n) and display numbers from 1 to n along with running totals on separate lines, 
as illustrated in below example. Numbers and running total should be separated by four space characters. For invalid number, display "ERROR".

Input	
4

Result
1     1
2     3
3     6
4     10

*/

import java.util.Scanner;
public class SumNatural
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n<1)
		{
			System.out.println("ERROR");
			System.exit(0);
		}
		System.out.println("Result");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			System.out.println(i+"    "+sum);
		}
	}
}

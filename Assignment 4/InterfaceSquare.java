/**
Complete the Java program with class A declaration implementing Number interface.


import java.util.Scanner;

interface Number {

    int findSqr(int i);  // Returns the square of n

}



/ /****

?????

//*****

  public class SqrDemo { 

        public static void main (String[] args){ 

	      A a = new A();   //Create an object of class A

           // Read a number from the keyboard

           Scanner sc = new Scanner(System.in);  

           int i = sc.nextInt();

           System.out.print(a.findSqr(i)); 

    } 

}

Provide only the missing part. Please note that "Check" button may be disabled. However, any compilation or runtime error will lead to nil grading.
For example:

Input	
5
Result

25


*/

import java.util.Scanner;

interface Number {

    int findSqr(int i);  // Returns the square of n

}

class A implements Number
{
	public int findSqr(int i)
	{
		return (int)Math.pow(i,2);
	}
}

public class InterfaceSquare { 

	public static void main (String[] args){ 

		A a = new A();   //Create an object of class A

		// Read a number from the keyboard
		
		Scanner sc = new Scanner(System.in);  

		int i = sc.nextInt();

		System.out.print(a.findSqr(i)); 

    } 

}


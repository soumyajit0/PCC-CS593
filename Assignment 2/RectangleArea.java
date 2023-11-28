/**

Below part of a Java program is already stored in this system to input the rectangle dimensions, 
create the rectangle object and display its area:


import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        Rectangle r1 = new Rectangle( a, b );  // Parameterized constructor used  for object creation
        System.out.println( r1.computeArea() );

    }
}



You need to write only the Rectangle class including its members, constructor and computeArea() method. 
Please note the dimensions can be given in decimal values. 
No need to write main() method as it is already stored in the system and will be automatically combined with your supplied code.

For example:

Input	   Result
2.0 3.0  6.0


*/

import java.util.Scanner;

public class RectangleArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        Rectangle r1 = new Rectangle( a, b );  // Parameterized constructor used  for object creation
        System.out.println( r1.computeArea() );

    }
}

class Rectangle
{
	private double length,breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double computeArea()
	{
		return (length*breadth);
	}
}

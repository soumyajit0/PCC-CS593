
/**

Study the following program on method overloading, and write only the missing part in the answer window:

import java.util.Scanner;

????   // Your code

public class MethodOverloadTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Inputs
        int n = sc.nextInt();
        double d = sc.nextDouble();
       
        // Instantiate MethodOverload class for using square methods
        MethodOverload mol = new MethodOverload();
       
        // Call square method
        System.out.printf("Square of %d: %d\n", n, mol.square(n) );
       
        // Call overloaded square method
        // BTW, overloading also possible with different number or order of parameters
        System.out.printf("Square of %f: %.2f\n", d, mol.square(d) ); // Overloaded method
    }
}

Input	Result
-2    Square of -2: 4
1.5   Square of 1.500000: 2.25

*/

import java.util.Scanner;

class MethodOverload {
    // Declare square method for returning area in integer
    public int square(int n) {
        return (int) Math.pow(n, 2);
    }

    // Declare square method for returning area in double
    public double square(double n) {
        return Math.pow(n, 2);
    }
}

public class SquareOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        int n = sc.nextInt();
        double d = sc.nextDouble();

        // Instantiate MethodOverload class for using square methods
        MethodOverload mol = new MethodOverload();

        // Call square method
        System.out.printf("Square of %d: %d\n", n, mol.square(n));

        // Call overloaded square method
        // BTW, overloading also possible with different number or order of parameters
        System.out.printf("Square of %f: %.2f\n", d, mol.square(d)); // Overloaded method
    }
}


/**

Observe the following program carefully which is expected to create thread and compute factorial:


???

public class TestRunnable {
    public static void main(String[] args) {
        System.out.println("Main Thread: Started");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        MyThread mt1=new MyThread("Factorial", n); //Construct a runnable object

        Thread nt1=new Thread(mt1); //Construct a thread on that object
        nt1.start(); //Start running the thread

        System.out.println("Main Thread: Ended");
     }
}


Replace ??? with suitable lines so that the program can run as illustrated in the example.

Write only the missing part in the answer window. Avoid writing the full program / class, main() method, input / output handling or validation of inputs.

For example:

Input	
4

Result
Main Thread: Started
Main Thread: Ended
Factorial Thread: Started
Factorial Thread: 24
Factorial Thread: Ended

*/

import java.util.Scanner;

class MyThread implements Runnable {
    private String s;
    private int n;

    MyThread(String s, int n) {
        this.s = s;
        this.n = n;
    }

    public void run() {
        System.out.println("Factorial Thread: Started");
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(s + " Thread: " + fact);
        System.out.println(s + " Thread: Ended");
    }
}

public class ThreadFactorial {
    public static void main(String[] args) {
        System.out.println("Main Thread: Started");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MyThread mt1 = new MyThread("Factorial", n); // Construct a runnable object

        Thread nt1 = new Thread(mt1); // Construct a thread on that object
        nt1.start(); // Start running the thread

        System.out.println("Main Thread: Ended");
    }
}

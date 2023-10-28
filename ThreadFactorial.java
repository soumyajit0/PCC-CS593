import java.util.*;

class MyThread implements Runnable
{
    int num;
    String message;
    MyThread(String s,int n){
        this.message=s;
        this.num=n;
    }
    public void run()
    {
        System.out.println(message+" Thread: Started");
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println(message+" Thread: "+fact);
        System.out.println(message+" Thread: Ended");
    }
}

public class ThreadFactorial
{
    public static void main(String[] args)
    {
        System.out.println("Main Thread: Started");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyThread mt1=new MyThread("Factorial", n);
        Thread nt1=new Thread(mt1);
        nt1.start();
        System.out.println("Main Thread: Ended");
     }
}
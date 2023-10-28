import java.util.*;

class MyThread implements Runnable {
	Thread thrd; 	
	int result;
    int[] list;
	private int sum;
	MyThread(String name, int[] nums )
    { 
		thrd = new Thread(this, name);
		list = nums;
		thrd.start();
	}

    public void run()
    {
        sum=0;
        for(int it:list)
        {
            sum+=it;
        }
        result=sum;
    }

	public int getSum()
    {
        return(result);
    }
}

public class ThreadList {
	public static void main(String[] args) {
		int[] arr = new int[10];
        int i = 0;              
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
            arr[i++] = sc.nextInt();
		MyThread mt1=new MyThread("C1", arr);
		MyThread mt2=new MyThread("C2", arr);
		try
        {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc)
        {
            System.out.println("Main thread interrupted" );
        }
		System.out.println( mt1.thrd.getName() + ": " + mt1.getSum() );
		System.out.println( mt2.thrd.getName() + ": " + mt2.getSum() );
	}
}
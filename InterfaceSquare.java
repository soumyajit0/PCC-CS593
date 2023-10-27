import java.util.Scanner;

interface Number
{
    int findSqr(int i);
}

class A implements Number
{
    public int findSqr(int i){
        return i*i;
    }
}

public class InterfaceSquare
{
    public static void main(String[] args)
    {
        A a = new A();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(a.findSqr(i));
        sc.close();
    }

}
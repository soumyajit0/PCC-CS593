import java.util.*;

public class InputException
{
    public static void main(String[] args)
    {
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        try
        {
            for(int i=1;i<=n;i++)
            {
                int a = sc.nextInt();
                s += a;
            }
            System.out.println(s);
        }
        catch(InputMismatchException e)
        {
            System.out.println("ERROR");
        }
    }
}
import java.util.*;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for (int i = 1;i <= n;i++)
            {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
        catch(Exception e)
        {
            System.out.println("ERROR");
        }
    }
}
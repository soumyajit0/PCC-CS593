import java.util.Scanner;
public class SumNatural
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("ERROR");
        }
        else
        {
            int sum = 0;
            for(int i = 1;i <= n;i++)
            {
                sum += i;
                System.out.println(i + "    " + sum);
            }
        }
    }
}
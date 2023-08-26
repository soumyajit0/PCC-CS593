import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n > 0)
        {
            int rem = n % 10;
            res = res * 10 + rem;
            n /= 10;
        }
        System.out.println(res);
    }
}
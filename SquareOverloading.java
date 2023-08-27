import java.util.Scanner;
class MethodOverload
{
    int square(int n)
    {
        return n * n;
    }
    double square(double d)
    {
        return d * d;
    }
}
public class SquareOverloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        MethodOverload mol = new MethodOverload();
        System.out.printf("Square of %d: %d\n", n, mol.square(n));
        System.out.printf("Square of %f: %.2f\n", d, mol.square(d));
    }
}
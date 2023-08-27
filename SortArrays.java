import java.util.Scanner;
import java.util.Arrays;
public class SortArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[100];
        int i = 0;
        while(sc.hasNextDouble())
            nums[i++] = sc.nextDouble();
        int size = i;
        Arrays.sort(nums,0,size);
        for(i = 0;i < size;i++)
            System.out.printf("%.2f ", nums[i]);
        System.out.println();
    }
}
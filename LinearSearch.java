import java.util.*;
public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int i=0, size;
	    double result;
        int nums[]= new int[50];
        int key = sc.nextInt();
    	while (sc.hasNextInt())
            nums[i++] = sc.nextInt();
        if (find(key, nums))
            System.out.println("Found");
        else
            System.out.println("Missing");
    }
    public static boolean find(int key, int[] nums)
    {
        for(int it:nums)
        {
            if (it == key)
                return true;
        }
        return false;
    }
}
/**

Partial Java program (click here to view) is internally stored in this system to input a few integers
and form an array. Write the missing method find(int key, int arr[]) to check whether a specific number 
is existing or not. Ensure to take inputs only when a number is existing in the input stream. 

Avoid displaying extra characters or input / output prompts while taking input or displaying output.



Input	
10
21 10 5

Result

Found

*/

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
    
    public static boolean find(int key,int arr[])
    {
    	for(int it:arr)
    	{
    		if (it==key)
    		{
    			return true;
    		}
    	}
    	return false;
    }
}

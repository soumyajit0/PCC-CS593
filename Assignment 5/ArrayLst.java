
/**
Please study the following program carefully which is responsible for inputting a few numbers, populate an array list, sort in descending order and perform binary search in the sorted list for the entered key.

You are required to supply the missing part in the answer window aligning with the expected outputs (refer the example).

import java.util.*;
public class ListDemo {
    
    ???? // Missing part

    public static void main(String[] args) {

        int key, index;       

        // Create Scanner objects
        Scanner sc = new Scanner(System.in);  // Handle inputs
        
        // Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Enter few numbers in a line and populate the list
        populateList( sc, al );    
        
        // Display list
        displayList( "Original List", al );
        
        // Sort list in descending order
        sortListDesc( al );
        
        // Display sorted list
        displayList( "Sorted List", al );
        
        // Input key
        key = sc.nextInt();
        
        // Perform binary search for key in al
        index = binSearch(al, key);
        if (index >= 0)
            System.out.println("Position: " + index);
        else
            System.out.println("Not found");
        }
}

You can also click here to download the part program for necessary modifications and testing.

Hints: For sorting in reverse order, you may use Collections.reverseOrder() parameter while calling Collections.sort().

For example:

Input	

45 23 67 12
23

Result

Original List: 45 23 67 12
Sorted List: 67 45 23 12
Position: 2

*/

import java.util.*;

public class ArrayLst {

    public static void populateList(Scanner sc, ArrayList<Integer> al) {
        String line = sc.nextLine();
        Scanner scs = new Scanner(line);
        while (scs.hasNext()) {
            al.add(Integer.parseInt(scs.next()));
        }
    }

    public static void displayList(String s, ArrayList<Integer> al) {
        System.out.print(s + ":");
        for (int it : al) {
            System.out.print(" " + it);
        }
        System.out.println();
    }

    // public static void displayList(String s,ArrayList<Integer> al){
    // System.out.print(s+": ");
    // Iterator<Integer> it=al.iterator();
    // while(it.hasNext()){
    // System.out.print(it.next()+" ");
    // }
    // System.out.println();
    // }

    public static void sortListDesc(ArrayList<Integer> al) {
        Collections.sort(al);
        Collections.reverse(al);
    }

    public static int binSearch(ArrayList<Integer> al, int key) {
        int left = 0;
        int right = al.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (al.get(mid) == key) {
                return mid;
            } else if (al.get(mid) < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int key, index;

        // Create Scanner objects
        Scanner sc = new Scanner(System.in); // Handle inputs

        // Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Enter few numbers in a line and populate the list
        populateList(sc, al);

        // Display list
        displayList("Original List", al);

        // Sort list in descending order
        sortListDesc(al);

        // Display sorted list
        displayList("Sorted List", al);

        // Input key
        key = sc.nextInt();

        // Perform binary search for key in al
        index = binSearch(al, key);
        if (index >= 0)
            System.out.println("Position: " + index);
        else
            System.out.println("Not found");
    }
}

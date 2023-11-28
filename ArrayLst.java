import java.util.*;

public class ArrayLst {
    public static void populateList(Scanner sc, ArrayList<Integer> al) {
        String s = sc.nextLine();
        Scanner scs = new Scanner(s);
        while (scs.hasNextInt()) {
            al.add(scs.nextInt());
        }
    }

    public static void displayList(String s, ArrayList<Integer> al) {
        System.out.print(s + " : ");
        for (int it : al) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void sortListDesc(ArrayList<Integer> al) {
        Collections.sort(al);
        Collections.reverse(al);
    }

    public static int binSearch(ArrayList<Integer> al, int key) {
        int left = 0, right = al.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (al.get(mid) == key)
                return mid;
            else if (al.get(mid) > key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int key, index;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        populateList(sc, al);
        displayList("Original List", al);
        sortListDesc(al);
        displayList("Sorted List", al);
        key = sc.nextInt();
        index = binSearch(al, key);
        if (index >= 0)
            System.out.println("Position: " + index);
        else
            System.out.println("Not found");
    }
}
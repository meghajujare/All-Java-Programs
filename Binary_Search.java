import java.util.*;

public class Binary_Search {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, mid, start, end, key;
        boolean found = false;
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array in ascending order");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.println("Enter the key to be searched");
        key = in.nextInt();
        start = 0;
        end = n - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == key) {
                found = true;
                System.out.println("Key found at index: " + mid);
                break;
            }

            else if (a[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        if (found == false)
            System.out.println("Key not found");

    }

}

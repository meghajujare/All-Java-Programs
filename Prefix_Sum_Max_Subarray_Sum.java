
//Prefix Sum Method
//Time complexity: O(n^2)
import java.util.*;

public class Prefix_Sum_Max_Subarray_Sum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, currsum = 0, largest = Integer.MIN_VALUE;
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int prefix[] = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + a[i];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int start = i;
                int end = j;
                currsum = 0;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currsum > largest)
                    largest = currsum;
            }
        }
        System.out.println("The Largest subarray sum: " + largest);
    }

}

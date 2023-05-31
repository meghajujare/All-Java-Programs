
//Kadans Method
//Time complexity: O(n)
import java.util.*;

public class Kadanes_Max_Sum_of_Subarray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, currsum = 0, largest = Integer.MIN_VALUE;
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        for (int i = 0; i < n; i++) {
            currsum = currsum + a[i];
            if (currsum < 0)
                currsum = 0;
            if (currsum > largest)
                largest = currsum;
        }
        System.out.println("The Largest subarray sum: " + largest);
    }

}


//Brute force Method
import java.util.*;

public class Max_Sum_of_Subarray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, tp = 0, sum = 0, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.println("The Subarrays are:");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                    sum = sum + a[k];
                }
                if (largest < sum)
                    largest = sum;
                if (smallest > sum)
                    smallest = sum;
                System.out.println();
                tp++;
            }

            System.out.println();
        }
        System.out.println("The total number of pairs: " + tp);
        System.out.println("The Largest subarray sum: " + largest);
        System.out.println("The smallest subarray sum: " + smallest);
    }
}

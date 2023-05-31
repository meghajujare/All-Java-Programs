import java.util.*;

public class Sub_Array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, tp = 0;
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.println("The Subarrays are:");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
                tp++;
            }

            System.out.println();
        }
        System.out.println("The total number of pairs: " + tp);
    }
}

import java.util.*;

public class Pairs_in_a_Array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, tp = 0;
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
                tp++;
            }

            System.out.println();
        }
        System.out.println("The total number of pairs: " + tp);
    }
}

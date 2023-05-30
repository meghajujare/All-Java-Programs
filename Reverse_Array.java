import java.util.*;

public class Reverse_Array {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements of the array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        reverse(a, n);
    }

    public static void reverse(int a[], int length) {
        int first = 0, last = length - 1, temp;
        while (first < last) {
            temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
        System.out.println("The reverse of the array");
        for (int i = 0; i < length; i++)
            System.out.println(a[i]);

    }
}

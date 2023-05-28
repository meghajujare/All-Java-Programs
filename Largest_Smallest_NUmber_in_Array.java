import java.util.*;

public class Largest_Smallest_NUmber_in_Array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] > largest)
                largest = a[i];
            if (a[i] < smallest)
                smallest = a[i];
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        in.close();
    }
}

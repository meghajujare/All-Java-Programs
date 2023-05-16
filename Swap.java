 import java.util.*;

public class Swap {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter 2 numbers");
        a = in.nextInt();
        b = in.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are:");
        System.out.println(a);
        System.out.println(b);
    }
}
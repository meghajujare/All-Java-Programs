
// Program to find the reverse of a number
import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int rev = 0, last_digit, n;
        System.out.println("Enter a number");
        n = in.nextInt();
        while (n > 0) {
            last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n / 10;

        }
        System.out.println("The reversed number is : " + rev);

    }

}

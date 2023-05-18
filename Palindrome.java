
//To check if the number is palindrome or not 
import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, num, rev = 0, ld;
        System.out.println("Enter the number");
        n = in.nextInt();
        num = n;
        while (n > 0) {
            ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        System.out.println("The reverse of the number is: " + rev);
        if (rev == num)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
        in.close();
    }

}


//To add all the digits of a number 
import java.util.*;

public class Sum_of_Digits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0, ld;
        System.out.println("Enter the number");
        n = in.nextInt();

        while (n > 0) {
            ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        System.out.println("The Sum of digits the number is: " + sum);
        in.close();
    }

}

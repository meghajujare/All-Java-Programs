
//To print the below pattern
//    1
//   212
//  32123
// 4321234
import java.util.*;

public class Palindromic_Pattern_with_numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i, j, k, count;
        System.out.println("ENter the number of rows");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n - i); j++)
                System.out.print(" ");

            count = i;

            for (k = count; k >= 1; k--)
                System.out.print(k);

            for (k = 2; k <= count; k++)
                System.out.print(k);

            System.out.println();

        }

    }

}

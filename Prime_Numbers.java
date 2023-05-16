import java.util.*;

public class Prime_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        if (num == 2)
            System.out.println("Number is Prime");
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    isPrime = false;
            }
            if (isPrime == true) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is Not Prime");
            }
        }

    }
}
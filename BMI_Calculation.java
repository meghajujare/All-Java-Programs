import java.util.*;

public class BMI_Calculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight, height;
        float bmi;

        System.out.println("Enter weight in kilograms: ");
        weight = in.nextDouble();

        System.out.println("Enter height in meters: ");
        height = in.nextDouble();

        bmi = (float) weight / (float) (height * height);

        System.out.println("Your Body Mass Index is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Healthy weight range");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}

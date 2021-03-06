import java.util.Scanner;

public class BMICategoriesStudyDrill {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        

        double m, kg, bmi, inches, lbs, feet, totalInches;
        System.out.print("Your height (feet only): ");
        feet = keyboard.nextDouble();

        System.out.print("your height (inches): ");
        inches = keyboard.nextDouble();
        totalInches = feet * 12 + inches;
        m = totalInches * 0.0254;

        System.out.print("Your weight in lbs: ");
        lbs = keyboard.nextDouble();
        kg = lbs * 0.453592;

        bmi = kg / (m * m);

        System.out.println("Your BMI is " + bmi);

        System.out.print("BMI category: ");
        if (bmi < 15.0) {
            System.out.println("very severely underweight");
        } else if (bmi <= 16.0) {
            System.out.println("severely underweight");
        } else if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25.0) {
            System.out.println("normal weight");
        }
        else if (bmi < 30.0) {
            System.out.println("overweight");
        } else if (bmi < 35.0) {
            System.out.println("moderately obese");
        } else if (bmi < 40.0) {
            System.out.println("severely obese");
        } else {
            System.out.println("very severely/\"morbidly\" obese");
        }
    }
}
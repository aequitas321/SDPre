// With only inches
// import java.util.Scanner;
//
// public class BMICalculatorStudyDrill {
//   public static void main(String[] args){
//     Scanner keyboard = new Scanner(System.in);
//     double m, kg, bmi, inches, lbs;
//
//     System.out.print("your height in inches: ");
//     inches = keyboard.nextDouble();
//     m = inches * 0.0254;
//
//     System.out.print("Your weight in lbs: ");
//     lbs = keyboard.nextDouble();
//     kg = lbs * 0.453592;
//
//     bmi = kg / (m*m);
//
//     System.out.println ("Your BMI is " + bmi);
//   }
// }

// With Feet and Inches
import java.util.Scanner;

public class BMICalculatorStudyDrill {
  public static void main(String[] args){
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

    bmi = kg / (m*m);

    System.out.println ("Your BMI is " + bmi);
  }
}

import java.util.Scanner;

public class Objective3Lab3{
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("How old are you??");
    age = keyboard.nextInt();
    currentYear = 2020;
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
  }
}

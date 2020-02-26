import java.util.Scanner;

 public class RudeQuestionsStudyDrill {
 public static void main( String[] args ) {
 String name;
 int age;
 double weight, income;

 Scanner keyboard = new Scanner(System.in);

 System.out.print( "Hello. What is your name? " );
 name = keyboard.next();

 System.out.print( "Hi, " + name + "! How old are you? " );
 age = keyboard.nextInt();

 System.out.println( "So you're " + age + ", eh? That's not very old." );
 System.out.print( "How much do you weigh, " + name + "? " );
 weight = keyboard.nextDouble();

 System.out.println( weight + "! Better keep that quiet!!" );
 System.out.print("Finally, what's your income, " + name + "? " );
 income = keyboard.nextDouble();

 System.out.print( "Hopefully that is " + income + " per hour" );
 System.out.println( " and not per year!" );
 System.out.print( "Well, thanks for answering my rude questions, " );
 System.out.println( name + "." );

 // No the program does not blow up when you put an int for a double because an int can be made to a double.
 // No the program does not blow up when you put an int or double in a string. Strings can read numbers.
// I can't make Q1 blow up
//Q2 Blows up when you imput a value other than int, because it is looking for an int imput in the Scanner
//Q3 & Q4 blows up when you imput a string because it is looking for a double imput.
 
    }
 }

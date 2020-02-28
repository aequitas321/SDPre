import java.util.Scanner;

public class EnterPinStudyDrill {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin, entry1;
        String password, entry;

        pin = 12345;
        password = "Bob";

        System.out.println("WELCOME TO THE BANK OF JAVA.");
        System.out.print("ENTER YOUR Password: ");
        entry = keyboard.next();

        while (! entry.equals(password)){
            System.out.println("\nINCORRECT Password. TRY AGAIN.");
            System.out.print("ENTER YOUR Password: ");
            entry = keyboard.next();
        }

        System.out.println("WELCOME TO THE BANK OF JAVA.");
        System.out.print("ENTER YOUR PIN: ");
        entry1 = keyboard.nextInt();

        while (entry1 != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry1 = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
    } 
}
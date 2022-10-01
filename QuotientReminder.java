//Java Program to Compute Quotient and Remainder

import java.util.Scanner;
public class QuotientReminder {
    public static void main(String[] args)
    {
        System.out.println("Enter dividend and divisor: ");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc1.nextInt();

        //Calculating Quotient and Reminder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        //Printing Quotient and Reminder
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}

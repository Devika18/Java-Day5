/*
Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */

import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);

        // input from command line
        int n = sc.nextInt();

        int i = 0;                // count from 0 to n
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        System.out.println("i value  |  Power of 2");
        while (i <= n) {

            System.out.println("   "+i + "     |      " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                                // double to get the next one
            i++;
        }

    }
}

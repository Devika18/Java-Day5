/*
Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {

        // Intializing and declaring the variables
        double result = 0, num = 0, j;
        int n;
        Scanner sc = new Scanner(System.in);

        // Input from command line
        System.out.println("Enter the harmonic you want to find: ");
        n = sc.nextInt();

        // Checking result of Harmonic Number
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("The value of harmonic no. " + n + " is: " + result);

    }

}

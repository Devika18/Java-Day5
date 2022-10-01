//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int n3 = sc.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

    }
}

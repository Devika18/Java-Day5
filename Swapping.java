//Java Program to Swap Two Numbers

import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        System.out.println("Enter value of a and b: ");
        Scanner a1 = new Scanner(System.in);
        Scanner b1 = new Scanner(System.in);

        int a = a1.nextInt();
        int b = b1.nextInt();
        int t;
        System.out.println("Before Swapping value of a and b is: "+a+"  "+b);
        if(a<b) {
            t = a;
            a = b;
            b = t;
            System.out.println("a value: "+a+"  b value: "+b);
        }
        else {
            System.out.println("Unable to do swapping");
        }
    }
}

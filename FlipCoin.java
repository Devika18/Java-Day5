/*
Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is positive integer .
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails
*/

import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {

        // Initializing and declaring the variables
        int n, h_cnt = 0, t_cnt = 0;
        double heads, tails;
        Scanner obj = new Scanner(System.in);

        // Giving input from command line
        System.out.println("enter no. of times you want to flip the coin: ");
        n = obj.nextInt();

        //Printing random values for n number of times
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            System.out.println("Random values are: "+Math.random());
            if (random < 0.5)
                t_cnt++;
            else
                h_cnt++;
        }

        //Calculating Percentage of heads and tails
        heads = h_cnt / (double) n * 100;
        tails = t_cnt / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }

}

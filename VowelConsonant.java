//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter the Character: ");
        Scanner c = new Scanner(System.in);
        char ch = c.next().charAt(0);

        if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ))
            System.out.println(ch + " is Vowel");
        else
            System.out.println(ch + " is Consonant");

    }
}

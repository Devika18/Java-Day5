/* Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
*/

import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            int year;
            boolean leap;

            year = obj.nextInt();

            //if the year is divided by 4
            if (year % 4 == 0) {

                //if the year is century
                if (year % 100 == 0) {

                    //if year is divided by 400, then it is a leap year

                    if (year % 400 == 0)
                        leap = true;
                    else leap = false;
                }
                //if the year is not century
                else leap = true;
            }

            else
                leap = false;
            if(leap)
                System.out.println(year + " is a Leap Year");
            else
                System.out.println(year + " is not Leap Year");

        }
    }


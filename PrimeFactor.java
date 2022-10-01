/* Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
 */
import java.util.Scanner;
public class PrimeFactor {
    public static boolean isPrime(int i)
    {
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no. to find Prime Factors: ");
        int n=obj.nextInt();
        System.out.println();
        System.out.println("The Prime Factors for the "+n+" is: ");
        System.out.println();

        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}

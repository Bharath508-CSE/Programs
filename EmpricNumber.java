import java.util.Scanner;
public class EmpricNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int reverse=reverseNumber(n);
        if(isPrime(n) && isPrime(reverse) && n!=reverse)
        {
            System.out.println(n+" is an Empric Number");
        }
        else
        {
            System.out.println(n+" is not an Empric Number");
        }
        
    }

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static int reverseNumber(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    
}


//  An Empric number is a prime number that remains prime when its digits are reversed. 
// For example, 
// 13 is an Empric number because both 13 and 31 are prime numbers. However, 23 is not an Empric number because while 23 is prime, its reverse, 32, is not prime.

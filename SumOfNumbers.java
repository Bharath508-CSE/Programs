import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("--- Enter the Number ---");
        int n=sc.nextInt();
        SumOfNumbers a=new SumOfNumbers();
        int res=a.sumOfNumbers(n);
        System.out.println(res);
    }
    int sumOfNumbers(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int digit=n%10;
            sum+=digit; // sum= sum+digit;
            n/=10;      //n=n/10;
        }
        return sum;

    }
    
}
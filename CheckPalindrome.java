class CheckPalindrome{
    static int rev=0;
    public static void main(String[] args) {
        int n=12321;
        int temp=n;
        check(n);
        if(rev==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
    static void check(int n)
    {
        if(n==0)
        {
            return;
        }
        int digit=n%10;
        rev*=10+digit;
        check(n/10);
    }
}

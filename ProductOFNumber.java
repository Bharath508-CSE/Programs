public class ProductOFNumber {
    public static void main(String args[])
    {
        int n=12345;
        System.out.println(productOfNumber(n));

    }
    static int productOfNumber(int n)
    {
        int product=1;
        while(n>0)
        {
            int digit=n%10;
            product=product*digit;
            n=n/10;
        }
        return product;

    }
}

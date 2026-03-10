class Automorphic
{
    public static void main(String[] args) {
        int n=7;
        int res=n*n;
        int digit=res%10;
        if(digit==n)
        {
            System.out.println("Automphoric Number "+digit);
        }
        else
        {
            System.out.println("Not Automophric Number "+digit);
        }
    }
}
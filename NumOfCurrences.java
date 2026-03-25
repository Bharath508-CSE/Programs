public class NumOfCurrences {

    public static void main(String[] args)
    {
        noOfCurrences();
    }
    static void noOfCurrences()
    {
        int a=10090;
        if(a>=2000)
        {
            System.out.println("2000 x "+(a/2000));
            a%=2000;
        }
        if(a>=500)
        {
            System.out.println("500 x "+(a/500));
            a%=500;
        }
        if(a>=200)
        {
            System.out.println("200 x "+(a/200));
            a%=200;
        }
        if(a>=100)
        {
            System.out.println("100 x "+(a/100));
            a%=100;
        }
        if(a>=50)
        {
            System.out.println("50 x "+(a/50));
            a%=50;
        }
        if(a>=20)
        {
            System.out.println("20 x "+(a/20));
            a%=20;
        }
        if(a>=10)
        {
            System.out.println("10 x "+(a/10));
        }

        
    }
    
}
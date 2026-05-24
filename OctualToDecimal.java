class OctualToDecimal{
    public static void main(String[] args) {
        int n=25;
        int rem=0;
        int power=0;
        while(n!=0)
        {
            int digit=n%10;
            rem+=digit*(int)Math.pow(8,power);
            power++;
            n/=10;
        }
        System.out.println(rem);
        
    }
}

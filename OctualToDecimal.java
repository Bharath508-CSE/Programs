class OctualToDecimal{
    public static void main(String[] args) {
        int n=25;
        String rem="";
        while(n!=0)
        {
            int digit=n%8;
            rem+=digit;
            n/=8;
        }
        System.out.println(rem);
        
    }
}

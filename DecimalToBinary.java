class DecimalToBinary {
    public static void main(String[] args) {
        int n=10;
        String binary="";
        while(n!=0)
        {
            int rem=n%2;
            binary=rem+binary;
            n/=2;
        }
        System.out.println(binary);
    }
}

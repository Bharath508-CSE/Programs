public class StringPalindrome {
    public static void main(String[] args)
    {
        String s="malayalam";
        if(isPalindrom(s))
        {
            System.out.println(s+" is a palindrome");
        }
        else
        {
            System.out.println(s+" is not a palindrome");
        }

    }
    static boolean isPalindrom(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

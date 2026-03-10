//Without using length function how to find the length

class LengthOfString
{
    public static void main(String[] args) {
        String name="Bharath";
        int count=0;
        try
        {
            while(true)
            {
                name.charAt(count);
                count++;
            }
        }
        catch(Exception e)
        {
            System.out.println(count);
        }
    }
}
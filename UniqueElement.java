public class UniqueElement {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9};;
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr)
    {
        int unique=0;
        for(int a:arr)
        {
            unique^=a;
        }
        return unique;
    }
    
}

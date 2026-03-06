public class BinarySearch 
{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int target=6;
        int result=BinarySearch1(a,target);
        if(result!=-1)
        {
            System.out.println("Element found "+result);
        }
        else 
        {
            System.out.println("Element not found ");
        }
    }
     public static int BinarySearch1(int[] arr,int target)
    {
        int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }

}

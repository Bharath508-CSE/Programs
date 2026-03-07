public class Floor 
{

     public static void main(String[] args) {
        int[] a={2,3,5,9,14,16,18};
        int target=12;
        int result=floor(a,target);
        System.out.println(result);
    }
    public static int floor(int[] arr,int target)
    {
         int start=0;
         int end=arr.length-1;
         while(start<=end)
         {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
         }
         return end;
    }
}

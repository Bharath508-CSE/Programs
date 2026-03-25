public class PositionOfElement {
    public static void main(String[] args)
    {

        int[] arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        int result=search(arr,target);
        System.err.println(result);
       
    }
    public static int search(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binaryS(arr,target,start,end);
    }
    public static int binaryS(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;

    }

}

/*
{1,2,3,4,5,6,7,8}
mid=0+(8-0)/2
mid=4 --> index 4 but the values is 5
target=3
target<arr[mid] --->5
end=mid-1
target>arr[mid]
start=mid+1
 
 */
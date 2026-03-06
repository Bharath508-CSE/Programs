public class Leetcode268 {

    public static void main(String[] args) {
        int[] arr={0,3,1};
        missingNumber(arr);
    }
    static public void missingNumber(int[] nums)
    {
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int result=totalSum-sum;
        System.out.println("The Missing number is : "+ result);
    }
}
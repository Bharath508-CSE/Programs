//1365. How Many Numbers Are Smaller Than the Current Number

import java.util.*;
public class Leetcode1365
{
    public static void main(String[] args)
    {
        int[] arr={8,1,2,3,4};
        smallerNumbersThanCurrent(arr);

    }
    public static void smallerNumbersThanCurrent(int[] nums)
    {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                    count+=1;
                }
            }
            result[i]=count;
        }
        System.err.println(Arrays.toString(result));
    }
}
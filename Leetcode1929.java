// 1929. Concatenation of Array
import java.util.*;
class Leetcode1929{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        getConcatenation(arr);
    }
    public static void getConcatenation(int[] nums)
    {
        int n=nums.length;
        int[] result=new int[2*n];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i];
            result[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
//  https://github.com/Bharath508-CSE/Programs.git

import java.util.*;

public class LinearSearch 
{
    public static void main(String[] args) {
      int[] a={1,2,3,4,5,6};
      int target=6;
      int result=LinearSearch1(a,target);
      if(result!=-1)
      {
        System.out.println("Element found "+result);
      }
      else 
      {
        System.out.println("Element not found ");
      }
      
    }
    public static int LinearSearch1(int[] arr,int target)
    {
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]==target)
          {
            return i;
          }
       }
       return -1;
    }
}
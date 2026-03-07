import java.util.*;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
       int[] arr={4,1,3,2,5,0};
       bubblesort(arr);
    }
    public static void  bubblesort(int[] arr)
    {
       int n=arr.length;
       for(int i=0;i<n-1;i++)
       {
         for( int j=0;j<n-1;j++)
         {
           if(arr[j+1]<arr[j])
           {
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
           }
         }
       }
       System.out.println(Arrays.toString(arr));
       
    }
}
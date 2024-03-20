# RearrangeArray
/* This Java program rearranges an array such that all negative numbers appear before positive numbers. 
It uses the two-pointer approach to achieve this rearrangement in linear time complexity without using extra space. */



import java.util.*;
public class RearrangeArray {
    public static void rearrangeArray(int[] arr)
    {
        int n = arr.length;
        int pivot = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                pivot++;
            }
        }
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter array of integers : ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        rearrangeArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

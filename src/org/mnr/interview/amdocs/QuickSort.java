package org.mnr.interview.amdocs;
 
import java.util.Arrays;

 
/** Class QuickSort **/
public class QuickSort 
{
    /** Quick Sort function **/
    public static void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    /** Quick sort function **/
    public static void quickSort(int arr[], int low, int high) 
    {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
 
        /** partition **/
        while (i <= j) 
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) 
            {
                /** swap **/
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
            }
        }
 
        /** recursively sort lower half **/
        if (low < j)
            quickSort(arr, low, j);
        /** recursively sort upper half **/
        if (i < high)
            quickSort(arr, i, high);
    }
    
    public static void main(String[] args) 
    {
        
    	int arr[] ={877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567};
        System.out.println("Elements before sorting :"+Arrays.toString(arr));  
        sort(arr);
        System.out.println("Elements after sorting :"+Arrays.toString(arr));

    }
} 
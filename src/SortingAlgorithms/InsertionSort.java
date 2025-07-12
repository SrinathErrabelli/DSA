package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        int arr[]={8,1,4,3,2};



        Arrays.sort(arr);
        insertionSort(arr);

        printArray(arr);
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void insertionSort(int arr[])
    {


        for(int i=1;i< arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }
}

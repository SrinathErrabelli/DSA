package SortingAlgorithms;

public class CountingSort {


    public static void main(String[] args) {

        int arr[]={1,3,2,2,7,8,5,6,7};

        countSort(arr);

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

    public static void countSort(int arr[])
    {
        int maxRange=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            maxRange=Math.max(maxRange,arr[i]);
        }

        int count[]=new int[maxRange+1];

        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        int j=0;

        for(int i=0;i< arr.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}

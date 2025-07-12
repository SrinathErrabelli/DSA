package SortingAlgorithms.Assignments;

public class CountingSort {

    public static void main(String[] args) {

        int arr[]={3,6,2,1,8,7,4,5,3,1};

        countSort(arr);

        SortingAlgorithms.CountingSort.printArray(arr);

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
        for(int k=count.length-1;k>=0;k--)
        {
            while(count[k]>0)
            {
                arr[j]=k;
                j++;
                count[k]--;
            }
        }
    }
}

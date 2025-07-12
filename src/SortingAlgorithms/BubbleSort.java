package SortingAlgorithms;

public class BubbleSort {


    public static void sortArray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
//            int MinPos=i;

            for (int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[]={8,1,4,3,2,9,10,11,5};

        sortArray(arr);

        printArray(arr);

    }
}

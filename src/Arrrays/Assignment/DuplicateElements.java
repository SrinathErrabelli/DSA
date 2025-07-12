package Arrrays.Assignment;

public class DuplicateElements {

    public static void main(String[] args) {
//        int arr[]={1,2,3,1};

        int arr[]={4,3,6,9,0};

        System.out.println(duplicateElements(arr));

    }

    public static boolean duplicateElements(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[i]==arr[k])  return true;
            }
        }

        return false;
    }

}

package Arrrays;

public class BinarySearch {


    public static void main(String[] args) {
        int nums[]={11,22,31,44,54,87,90};
        int key=54;

        int index=binarySearch(nums,key);

        System.out.println("Element is found at Index::"+index);

    }

    public static int binarySearch(int nums[],int key)
    {
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(key==nums[mid])
            {
                return mid;
            }

            if(key<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return -1;

    }
}

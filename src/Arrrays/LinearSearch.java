package Arrrays;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[]={8,2,45,11,99,21,20};
        int key=76;
        int index=searchkey(arr,key);

        System.out.println("Key is found at Index::"+index);
    }


    public static int searchkey(int nums[],int key)
    {
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}

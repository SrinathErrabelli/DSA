package Arrrays;

public class LargestElement {


    public static void main(String[] args) {

        int nums[]={21,99,2,5,109,33,858,1};

        int largest=largestElement(nums);


        System.out.println("Largest Element in the Array is :"+largest);

    }

    public static int largestElement(int nums[])
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
//            if(max<nums[i])
//            {
//                max=nums[i];
//            }

            max=Math.max(max,nums[i]);
        }

        return max;
    }
}

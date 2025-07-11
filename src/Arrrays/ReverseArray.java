package Arrrays;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {

        int nums[]={1,35,7,8,9,11,89,90};

        Arrays.stream(nums).forEach(num -> System.out.print(num+" "));

        reverseArray(nums);

        System.out.println();

        Arrays.stream(nums)
                .filter(n -> n%2!=0)
                .map(n -> n+10)
                .forEach(num -> System.out.print(num+" "));

    }

    public static void reverseArray(int nums[])
    {

        int start=0;
        int end=nums.length-1;


        while(start<end)
        {
            int temp=nums[end];
             nums[end]=nums[start];
            nums[start]=temp;

            start++;
            end--;

        }




    }

}

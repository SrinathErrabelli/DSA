package Arrrays;

public class SubArraySum {

    public static void main(String[] args) {
        int nums[]={-2,-3,4,-1,-2,1,5,-3};

        bruteForceSubArraySum(nums);

        prefixSumMethod(nums);

        kadanes(nums);
    }


    public static  void bruteForceSubArraySum(int nums[])
    {
        int maxSum=Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++)
        {

            for(int j=i;j<nums.length;j++)
            {
                int currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum=currSum+nums[k];

                }

                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum is::"+maxSum);

    }


    public static void prefixSumMethod(int nums[])
    {

        int maxSum=Integer.MIN_VALUE;

        int prefix[]=new int[nums.length];

        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }


        for(int i=0;i<nums.length;i++)
        {
            int start=i;
            for(int k=i;k<nums.length;k++)
            {
                int end=k;

                int currSum= start==0?prefix[end]:prefix[end]-prefix[start-1];

                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }


            }
        }

        System.out.println("Max sum by PrefixSum is :"+maxSum);


    }

    public static void kadanes(int nums[])
    {
        int maxSum=Integer.MIN_VALUE;

        int currSum=0;

        for(int i=0;i<nums.length;i++)
        {
            currSum=currSum+nums[i];


            if(currSum<0) currSum=0;

            if(currSum>maxSum) maxSum=currSum;


        }

        System.out.println("Maximum Sum using kadanes:"+maxSum);



    }



}

package Arrrays;

public class SubArray
{
    public static void main(String[] args) {

        int num[]={2,-1,-6,5,10};

        printSubArrays(num);

    }

    public static void printSubArrays(int numbers[])
    {
        int maxSubArray=Integer.MIN_VALUE;
        int minSubArray=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            int start=i;

            for(int k=i;k<numbers.length;k++)
            {
                int end=k;
                int Sum=0;
                for(int l=start;l<=end;l++)
                {
                    System.out.print(numbers[l]+" ");
                    Sum=Sum+numbers[l];

                }

                if(Sum>maxSubArray)
                {
                    maxSubArray=Sum;
                }

                if(Sum<minSubArray)
                {
                    minSubArray=Sum;
                }
                System.out.println();
            }


        }

        System.out.println("max Sum of Subarray:"+maxSubArray);
        System.out.println("Min Sum of Subarray:"+minSubArray);

    }
}

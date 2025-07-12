package Arrrays.Assignment;

public class Triplets {


    public static void main(String[] args) {

        int nums[]=  {-1, 0, 1, 2, -1, -4};

       printTriplets(nums);
    }

    public static void printTriplets(int nums[])
    {

        for(int i=0;i<nums.length;i++)
        {
            for(int k=i+1;k<nums.length;k++)
            {

                for(int m=k+1;m<nums.length;m++)
                {

                    if((i!=k && i!=m) && k!=m)
                    {
                        if(nums[i]+nums[k]+nums[m]==0)
                        {
                            System.out.println("["+nums[i]+","+nums[k]+","+nums[m]+"]" + " ");
                        }
                    }

                }
            }
        }
    }
}

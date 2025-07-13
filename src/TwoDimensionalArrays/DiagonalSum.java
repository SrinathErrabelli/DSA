package TwoDimensionalArrays;

public class DiagonalSum {


    public static void main(String[] args) {


        int[][] evenArray = {  {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int[][] oddArray = {  {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        int diagonalSum=sumOfDiagonal(oddArray);

        System.out.println("Sum of Diagonal is:"+diagonalSum);
    }

    public static int sumOfDiagonal(int nums[][])
    {

        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(i==j)
                {
                    sum+=nums[i][j];
                }
                else if(((i+j)==nums.length-1) && i!=j)
                {
                    sum+=nums[i][j];
                }
            }
        }

        return sum;
    }
}

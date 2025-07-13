package TwoDimensionalArrays.Assignment;

public class SumofNumbers {
    public static void main(String[] args) {

        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        int row=4;

        int sum=sumofElements(nums,row);

        System.out.println("Sum of Elements in "+row+"-row is:"+sum);


    }





    public static  int sumofElements(int array[][],int row) {

        int sum = 0;

        if(row>array.length)
        {
            return -1;
        }

        for (int j = 0; j < array[0].length; j++) {
            sum += array[row - 1][j];

        }


        return sum;

    }
}

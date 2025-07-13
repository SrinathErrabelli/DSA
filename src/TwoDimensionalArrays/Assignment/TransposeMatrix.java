package TwoDimensionalArrays.Assignment;

public class TransposeMatrix {

    public static void main(String[] args) {

        int[][] array = { {4,7,8},{8,8,7} };

        int transposedArray[][]=transposeMatrix(array);


        for(int i=0;i<transposedArray.length;i++)
        {
            for(int j=0;j<transposedArray[0].length;j++)
            {
                System.out.print(transposedArray[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int[][] transposeMatrix(int num[][])
    {
        int orgArrRows= num.length;
        int orgArrCols=num[0].length;

        int transposeRows=orgArrCols;
        int transposeCols=orgArrRows;


        int transpose[][]=new int[transposeRows][transposeCols];

        for(int i=0;i<transposeRows;i++)
        {  int rows=0;
            for(int j=0;j<transposeCols;j++)
            {
                transpose[i][j]=num[rows][i];

                rows++;
            }
        }



        return transpose;
    }
}

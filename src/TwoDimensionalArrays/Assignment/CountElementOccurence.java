package TwoDimensionalArrays.Assignment;

public class CountElementOccurence {


    public static void main(String[] args) {


        int[][] array = { {4,7,8},{8,8,7} };

        int key=7;

        int count=findOccurences(array,key);

        System.out.println("Row length:"+array.length);

        System.out.println("column length:"+array[0].length);

        System.out.println("Count  is:"+count);
    }


    public static  int findOccurences(int array[][],int key)
    {

        int count=0;

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(array[i][j]==key)
                {
                    count++;
                }
            }
        }


        return count;


    }

}

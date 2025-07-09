package Patterns;

public class SolidRhombus {

    public static void main(String[] args) {

        printRhombus(5);

    }


    public static  void  printRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {

            // spaces -(n-i)

            for(int k=1;k<=(n-i);k++)
            {
                System.out.print(" ");
            }

            for(int l=1;l<=n;l++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

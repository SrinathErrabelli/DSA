package Patterns;

public class Butterfly {

//        *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *
    public static void main(String[] args) {

        printButterfly(4);



    }


    public static void printButterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {
           //Stars
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            //Spaces
            for(int l=1;l<=(2*(n-i));l++)
            {
                System.out.print(" ");
            }

            //Stars
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();

        }


        for(int i=n;i>=1;i--)
        {

            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=1;l<=(2*(n-i));l++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();

        }


    }

}

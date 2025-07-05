package Patterns;


import java.util.Scanner;

public class InvertedHalfPyramid {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows::");

        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows;j++)
            {

                if(j>=(rows-i+1))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for(int i=1;i<=rows;i++)
        {

            //printing Empty spaces
            for(int j=1;j<=(rows-i);j++)
            {
                System.out.print(" ");

            }
            //printing Stars
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }



        //another logic



    }
}

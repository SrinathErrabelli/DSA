package Patterns;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the No of Rows to be Printed :");
        //Capturing the Row no from the command line
        int rowNo=sc.nextInt();

        //outer loop - this determines how many rows
        for(int i=1;i<=rowNo;i++)
        {
            //inner loop - this determines how for * to printed for each row
            //when row i is this 1, it will iterate 1 time, when i is 2 it will iterate 2 times ...etc
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

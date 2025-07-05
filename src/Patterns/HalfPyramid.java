package Patterns;

import java.util.Scanner;

public class HalfPyramid {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the No of Rows to be Printed :");
        //Capturing the Row no from the command line
        int rowNo=sc.nextInt();


        for(int line=1;line<=rowNo;line++)
        {
            int count=1;
            for(int j=1;j<=line;j++)
            {
                System.out.print(count+" ");
                count++;
            }

            System.out.println();
        }
    }
}

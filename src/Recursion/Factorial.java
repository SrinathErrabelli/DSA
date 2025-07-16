package Recursion;

public class Factorial {



    public static int fact(int n)
    {


        if(n==0)
        {
            return 1;
        }
        int result=n*fact(n-1);


        return result;

    }



    public static void main(String[] args) {

        System.out.println("Factoria is: "+fact(6));

    }
}

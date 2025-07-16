package Recursion;

public class SumofNumbers {


    public static void main(String[] args) {


        System.out.println(sum(10));
    }


    public static int sum(int n)
    {
        if(n==1) return 1;

        int sumofn=n+sum(n-1);


        return sumofn;

    }

}

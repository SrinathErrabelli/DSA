package Functions;

public class FunctionOverloading {

    public static void main(String[] args) {

        int sumofInt=sum(10,7);

        float sumofFloat=sum(10.5f,3.2f);

        int sum=sum(10,33,22);



        System.out.println("Sum is:"+sumofInt);
        System.out.println("Sum is:"+sumofFloat);
        System.out.println("Sum is:"+sum);






    }

   //sum of 2 numbers
    public static int sum(int a,int b)
    {

        return a+b;
    }

    //Sum of 2 numbers with floating points
    public static float sum(float a,float b)
    {

        return a+b;
    }
  //sum of 3 numbers
    public static int sum(int a,int b,int c)
    {

        return a+b+c;
    }

}

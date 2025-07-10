package Functions.Practise;
//Write a Java method to compute the averageof three numbers.
public class Average {

    public static void main(String[] args) {

        int avg=average(3,4,5);

        System.out.println("Average of 3 Numbers is :"+avg);
    }
    public static int average(int a,int b,int c)
    {

        return (a+b+c)/3;
    }
}

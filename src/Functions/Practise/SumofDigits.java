package Functions.Practise;

public class SumofDigits {


    public static void main(String[] args) {

        int sum=sumofDigits(12345);

        System.out.println("Sum of Digits ::"+sum);
    }

    public static int sumofDigits(int n)
    {
        int sum=0;

        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;

            n=n/10;


        }

        return sum;


    }

}

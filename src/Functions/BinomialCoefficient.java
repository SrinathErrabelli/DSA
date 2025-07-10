package Functions;

public class BinomialCoefficient {

    public static void main(String[] args) {


        System.out.println("factorial is ::"+factorial(7));

        System.out.println("Binomial Coefficient is::"+binomialCoefficient(6,2));
    }


    public static int factorial(int n)
    {
        int f=1;

        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }

        return f;
    }


    public static int binomialCoefficient(int n,int r)
    {
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int binCoeff=n_fact/(r_fact*nmr_fact);

        return binCoeff;

    }

}

package Functions;

public class Factorial {


    public static void main(String[] args) {

    }


    public static int factoial(int n)
    {
        int f=1;

        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }

        return f;
    }
}

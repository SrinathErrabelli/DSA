package Functions.Practise;

public class EvenOrOdd {


    public static void main(String[] args) {
        boolean isEven=isEven(12);

        System.out.println("Number provided is even?:"+isEven);
    }

    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}

package Functions.Practise;

public class Palindrome {

    public static void main(String[] args) {


        System.out.println("Given number is palindrome::"+isPalindrome(110));
    }


    public static boolean isPalindrome(int num)
    {
        int originalNum=num;
        int reversedNum=0;
        int pow=0;

        while(num>0){
        int rem=num%10;
        reversedNum=rem+(reversedNum*10);

        pow++;

        num=num/10;

        }

        if(originalNum==reversedNum)
        {
            return true;
        }

            return false;





    }

}

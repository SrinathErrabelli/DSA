package Misc.Streams;

import java.util.stream.IntStream;

public class PrintOddNumbers {

    public static void main(String[] args) {


        IntStream.rangeClosed(1,50).filter(n -> n%2==1).forEach(n -> System.out.print(n+" "));
    }
}

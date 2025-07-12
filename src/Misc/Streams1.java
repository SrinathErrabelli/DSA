package Misc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams1 {

    public static void main(String[] args) {

       //boxed is used for converting integers (Primitive Data type) to objects  ie. Integer object
        List<Integer> oddNumList=IntStream.rangeClosed(1,50).filter(n -> n%2==1).boxed().toList();

        List<Integer> nums= Arrays.asList(1,3,4,5,6,7,7,8,9,10);

        List<Integer> evenList= nums.stream().filter(n -> n%2==0).collect(Collectors.toList());

        List<String> names=Arrays.asList("srinath","meghana","prapul","siva","rajesh");

        List<String> namesUpperCase=names.stream().map( n-> n.toUpperCase()).collect(Collectors.toList());


            System.out.println(names.stream().filter(n -> n.startsWith("s")).count());


            Optional<Integer> maxNum=nums.stream().max(Integer::compareTo);

        Optional<Integer> minNum=nums.stream().min(Integer::compareTo);

        maxNum.ifPresent(n -> System.out.println("Maximum number is"+n));





        System.out.println("Yes");

    }
}

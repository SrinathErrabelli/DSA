package Misc.Streams;

import java.util.Arrays;

public class SecondSmallestElement {

    public static void main(String[] args) {

        int[] nums ={0,5,6,1,2,3,90,1,2};

        int secondSmallest=Arrays.stream(nums).distinct().sorted().skip(1).findFirst().orElseThrow();

        System.out.println(secondSmallest);
    }
}

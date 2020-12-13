

import java.util.*;
import java.util.stream.Collectors;


public class Outline {
    public static void main(String... args) { // varargs alternative to String[]
    ArrayList<Integer> intArray = new ArrayList<>();
        intArray.addAll(Arrays.asList(1,2,3,4,5,6));

        /**
         * Question 3 - squaring numbers using a stream
         */

        List<Integer> targetList = new ArrayList<>();
        List<Integer> result = intArray.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());


        /**
         * Question 4/5 - return all pairs of numbers whose sum is divisible by three
         */

        ArrayList<Integer> intA1 = new ArrayList<>();
        ArrayList<Integer> intA2 = new ArrayList<>();

        intA1.add(1);
        intA1.add(2);
        intA1.add(3);
        intA2.add(3);
        intA2.add(4);



        List<List<Integer>> pairs = intA1.stream()
                .flatMap(i -> intA2.stream().filter(j -> (i+j)%3 == 0) //checks at each instantiation of the second stream if the sum of the pair is divisible by 3
                        .map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());

    }
}

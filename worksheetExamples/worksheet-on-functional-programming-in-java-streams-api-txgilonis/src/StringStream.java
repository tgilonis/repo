import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {

        /**
         * Question 6 - loop through a list of words and print
         */

        List<String> words = Arrays.asList("hello", "darkness", "my", "old", "friend", "meq", "meg");

        words.stream().forEach(x -> System.out.println("  " + x));

        /**
         * Question 7 - use a method reference instead
         */

        words.stream().forEach(System.out::println);

        /**
         * Question 8 -
        Produce the same transformations using map:

        List<String> excitingWords = transformedList(words, s -> s + "!");

        List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));

        List<String> upperCaseWords = transformedList(words, String::toUpperCase);
        */




        List<String> excitingWords = words.stream()
                .map(x -> x + "!").collect(Collectors.toList());



        List<String> eyeWords = words.stream().map(x -> x.replace("i", "eye")).collect(Collectors.toList());



        List<String> upperCaseWords = words.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());




        /**
         * Question 9
        Produce the same lists except filtered

        List<String> shortWords = allMatches(words, s -> s.length() < 4);

        List<String> wordsWithB = allMatches(words, s -> s.contains("b"));

        List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);
         */



        List<String> shortWords = words.stream().filter(x -> x.length() < 4).collect(Collectors.toList());

        List<String> wordsWithB = words.stream().filter(x -> x.contains("d")).collect(Collectors.toList());

        List<String> evenLengthWords = words.stream().filter(x -> (x.length()) % 2 == 0).collect(Collectors.toList());




        /**
         * Question 10
        Turn the strings in the array words into uppercase,
        keep only the ones that are shorter than four characters,
         and, of what is remaining, keep only the ones that contain "e",
          and print the first result. Repeat the process, except checking for a "q"
          instead of an "e".
         */
        Predicate<String> lessThan4 = (x) -> (x.length() < 4);
        Predicate<String> containsE = (x) -> x.contains("E");
        Predicate<String> containsQ = (x) -> x.contains("Q"); //checks for lower case q

        List<String> multiFilter = words.stream().map(String::toUpperCase).filter(lessThan4).filter(containsE).collect(Collectors.toList());

        multiFilter.forEach(System.out::print);

        multiFilter.stream().filter(containsQ).forEach(System.out::print);
        /**
         * Question 11.
         * Show lazy evaluation
         */

        List<String> lazy = words.stream().map(String::toUpperCase).filter(x -> (x.length() < 4) && x.contains("e")).collect(Collectors.toList()); //does not evaluate lazily/i dont know what lazy evaluation is...


        /**
         * Question 12 - Number lists
         */

        List<Double> test = randomNumberList(3);
        List<Integer> test2 = orderedNumberList(50, 5, 3);



        /**
         * Question 14 - three ways to sum a list of numbers
         */

        test2.stream().mapToInt(i -> i).sum();
        test2.stream().collect(Collectors.summingInt(i -> i));
        test2.stream().reduce(0, Integer::sum);

        //parallel
        /**
         * Question 15 - parallel(when run a few times, the last digits can sometimes be seen not to match
         */
        test2.parallelStream().reduce(0, Integer::sum);

        /**
         * Question 16 - sum double -> parallel stream does not always match regular stream answer
         *
         */

        test.stream().mapToDouble(i -> i).sum();
        test.parallelStream().mapToDouble(i->i).sum();
        test.parallelStream().reduce(0.0, Double::sum);

    }

    /**
     * Question 12 - number list
     * @param size
     * @return
     */
    public static List<Double> randomNumberList(int size) {
        List<Double> randNumList = new ArrayList<>();
        for(int i = 0; i < size; i++) randNumList.add(Math.random());
        return randNumList;
    }

    /**
     * Question 13 - ordered number list
     * @param start
     * @param increment
     * @param size
     * @return
     */
    public static List<Integer> orderedNumberList(int start, int increment, int size) {
        List<Integer> ordNumList = new ArrayList<>();
        for(int i = start; i < start + size * increment; i += increment) ordNumList.add(i);
        return ordNumList;
    }
}

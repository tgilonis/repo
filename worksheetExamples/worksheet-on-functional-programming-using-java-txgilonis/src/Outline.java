import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Outline {

  static int containsE(String s) {

    if(s.contains("e")) return 0;
    return 1;
  }

  static int eChecker(String s1, String s2) {
      if(s1.contains("e") && !s2.contains("e")) return -1;
      if(!s1.contains("e") && s2.contains("e")) return 1;
      return 0;
  }

  public static void main(String... args) {
      // varargs alternative to String[]

      /**
       * Question 1 Answers found below
       */
    Integer[] intArray = {1, 7, 3, 4, 8, 2};


    //sort in order of length
    String[] str_array = {"I'm", "afraid", "I", "can't","do", "that"};
    //Lambda expression commented out - method reference version used
    //Arrays.sort(str_array, (first, second) -> Integer.compare(first.length(), second.length()));
    Arrays.sort(str_array, Comparator.comparingInt(String::length));


    //reverse length order
    String[] str_array2 = {"I'm", "afraid", "I", "can't","do", "that"};
    Arrays.sort(str_array2, (Comparator.comparingInt(String::length).reversed()));


    //sort as per first letter
    String[] str_array3 = {"I'm", "afraid", "I", "can't","do", "that"};
    Arrays.sort(str_array3, String::compareToIgnoreCase);


    //containing e
    String[] str_array4 = {"I'm", "afraeid", "I", "can't","do", "that", "Dave"};
    //Arrays.sort(str_array4, (first, second) -> containsE(first) - containsE(second));
    Arrays.sort(str_array4, Comparator.comparingInt(Outline::containsE));


      /**
       * Question 2 - method reference in place of lambda
       */
    String[] str_array5 = {"I'm", "afraeid", "I", "can't","do", "that", "Dave"};
    Arrays.sort(str_array5, Outline::eChecker);


      /**
       * Question 3 - two string predicate
       */
      String first = "first string";
      String second = "second string";
      String third = "three";
      System.out.println("two string predicate with lambda: " + LambdaStrings.betterString(first, second, (f, s) -> first.length() > second.length()));

    /**
     * Question 4 - generic two element predicate
     */
    System.out.println("two string predicate using generics test 2: " + LambdaStrings.betterEntry(first, second, (f, s) -> first.length() > second.length()));
    System.out.println("two string predicate using generics test 2: " + LambdaStrings.betterEntry(first, third, (f, s) -> first.length() > third.length()));
    /**
     * Question 5 - static method taking a list of strings and testing a predicate
     */
    List<String> words = new ArrayList<>();
    words.addAll(Arrays.asList("I'm", "afraeid", "I", "can't","do", "that", "Dave", "my", "boy"));
    List<String> shortWords = allMatches(words, s -> s.length() < 4);
    List<String> wordsWithB = allMatches(words, s -> s.contains("b"));
    List<String> evenLengthWords = allMatches(words, s -> (s.length() % 2) == 0);


    List<String> shortWords2 = allMatchesAnything(words, s -> s.length() < 4);
    List<String> wordsWithB2 = allMatchesAnything(words, s -> s.contains("b"));
    List<String> evenLengthWords2 = allMatchesAnything(words, s -> (s.length() % 2) == 0);



    /**
     * Question 6 - static generic method for lists
     */

    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(1,2,3,4,5));
    List<Integer> even = allMatchesAnything(numbers, n -> (n % 2) == 0);


    /**
     * Question 8 - transformedList method
     */

    List<String> excitingWords = transformedList(words, s -> s + "!");
    List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
    List<String> upperCaseWords = transformedList(words, String::toUpperCase);




    /**
     * Question 9 - generic transformed list method
     */

    List<String> excitingWords2 = genericTransformedList(words, s -> s + "!");
    List<String> eyeWords2 = genericTransformedList(words, s -> s.replace("i", "eye"));
    List<String> upperCaseWords2 = genericTransformedList(words, String::toUpperCase);



    List<Integer> bigNumbers = genericTransformedList(numbers, n -> n * 10000);




  }

  /**
   * Question 5 - static method for list and predicate
   * @param list
   * @param predicate
   * @return
   */
  static List<String> allMatches(List<String> list, Predicate<String> predicate) {
    List<String> result;
    result = list.stream().filter(predicate).collect(Collectors.toList());
    return result;
  }

  /**
   * Question 6 - static method for generic list and predicate
   * @param list
   * @param predicate
   * @param <T>
   * @return
   */
  static <T> List<T> allMatchesAnything(List<T> list, Predicate<T> predicate) {
    List<T> result;
    result = list.stream().filter(predicate).collect(Collectors.toList());
    return result;
  }

  /**
   * Question 7 - transformedList
   * @param list
   * @param function
   * @return
   */
  static List<String> transformedList(List<String> list, Function<String, String> function) {
    List<String> result = new ArrayList<>();
    for (String word : list) {
      result.add(function.apply(word));
    }
    return result;
  }

  /**
   * Question 8 - generic transformed list
   * @param list
   * @param function
   * @param <T>
   * @return
   */
  static <T> List<T> genericTransformedList(List<T> list, Function<T, T> function) {
    List<T> result = new ArrayList<>();
    for (T item : list) {
      result.add(function.apply(item));
    }
    return result;
  }
}









public class LambdaStrings {
    /**
     * Question 3 - Create a class with a static method called betterString
     */
    public static String betterString(String s1, String s2, TwoStringPredicate p) {
        if(p.betterString(s1, s2)) return s1;
        return s2;
    }

    /**
     * Question 4 - Create a generic betterEntry method that works the same as betterString
     * @param t1
     * @param t2
     * @param p
     * @param <T>
     * @return
     */
    public static <T> T betterEntry(T t1, T t2, TwoElementPredicate p) {
        if(p.betterEntry(t1, t2)) return t1;

        return t2;
    }

}

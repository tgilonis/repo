

import java.util.*; // for conciseness

import java.util.stream.Stream;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Type.MEAT),
                    new Dish("beef", false, 700, Type.MEAT),
                    new Dish("chicken", false, 400, Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));


    /**
     * Question 1 - how would you filter the first two meat dishes?
     */


    public static void main (String[] args) {
        Stream<Dish> menuStream = menu.stream()
                .filter(s -> s.getType() == Type.MEAT).limit(2);
        menuStream.forEach(System.out::println);

        /**
         * Question 2 - How would you count the number of dishes in a stream using the map and reduce methods?
         */


        Stream<Dish> menuStream2 = menu.stream();

        System.out.println(menuStream2.count());






    }








}
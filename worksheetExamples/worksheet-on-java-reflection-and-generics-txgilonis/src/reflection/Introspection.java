package reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

/*
  Write a Java program that reads the name of a class from the command line and emits the interface of
  the class in Java syntax (interface or class, modifiers, constructors, methods, fields; no method bodies).
 */
public class Introspection {

  public static void main(String[] args) {

    Animal Trigger = new Dog(3, "Trigger", "Mammal");
    System.out.println(Trigger.speak());
    /**
     * Question 1 - forName instantiation
     */
    try {

      Class dogClass = Class.forName("reflection.Dog");

      for (Constructor c1: dogClass.getConstructors()) {
        System.out.println("Constructor: " + c1);
        }

      Constructor constructor = dogClass.getConstructor(Integer.TYPE, String.class, String.class);

      /**
       * Question 2 -
       * Instantiate newDog using a constructor and list of arguments
       *
       */
      Object newDog = constructor.newInstance(5, "Max Power", "Dog");

      System.out.println("Check newDog has instantiated with correct values");
      System.out.println(newDog.toString());
      System.out.println("Check that newDog is not equal to Trigger");
      System.out.println(Trigger.equals(newDog));

      System.out.println("Now to create an instance of cat using arguments");

      String catClass = "reflection.Cat";
      Object [] splitArgs = {12, "Twitch", "Cat", "Man Flesh"};


      Class<?> animalClass = Class.forName(catClass);

      Constructor[] cons = animalClass.getConstructors();

      Constructor con = null;

      for (Constructor item : cons) {
        if (item.getParameterTypes().length == splitArgs.length) {
          con = item;
        }
      }
      for (Class cl : con.getParameterTypes()) {
        System.out.println(cl);
      }
      Object o = con.newInstance(splitArgs);
      System.out.println(o);






      for (Method method : o.getClass().getDeclaredMethods()) {
        System.out.println("Method: " + method.getName());
      }
      System.out.println("Cat says: " + ((Animal) o).speak());
      System.out.println("Cat's favourite food: " + ((Cat) o).getFavFood());


    } catch (Exception e) {
      System.err.println("error");
      e.printStackTrace();
    }
  }
}

package generics;

public class Driver {
  public static void main(String[] args) {
    Storage<BankAccount>  aStorage = new Storage<>();
    Storage<String>       sStorage = new Storage<>();
    /*
    1. What are the reasons for using generics here?
    What are the benefits?

    Allows us to use the Storage class with multiple parameter types
    Here we have initialized two objects - one with type BankAccount, and one with type String

    This also means that we avoid the need to cast objects that have been initialized using generics
     */

    /*
    Class baCls = BankAccount.class;
    try {
      Object myAccount =  baCls.newInstance();
      aStorage.setValue(myAccount);
      // Deposit
      myAccount.deposit(15);
    }
    catch ( InstantiationException e ) {
      // ...
    }
    catch ( IllegalAccessException e ) {
      // ...
    }

    2. Compile and analyse the compiler output.
    What is the cause of the problem reported by the compiler, if any?

    myAccount was instantiated as Object - not BankAccount class. Therefore:

    Incompatible types - object cannot be converted to generics.BankAccount (knock on effect:
    cannot find method deposit since myAccount had not been initialized as BankAccount)
     */

    /*
    Class baCls = BankAccount.class;
    try {
      BankAccount myAccount =  baCls.newInstance();
      aStorage.setValue(myAccount);
      // Deposit
      myAccount.deposit(15);
    }
    catch ( InstantiationException e ) {
      // ...
    }
    catch ( IllegalAccessException e ) {
      // ...
    }


    3. How does this affect the compilation process?
    What is the problem, if any?
    What does the myAccount variable hold when the code is executed?
    Decide whether your analysis from the previous question was correct.

    myAccount is still not compiled correctly, as it needs to be cast to ensure that it is of the class BankAccount
    This is due to the type-erasure of generic objects - ensuring that no new classes are created for parameterized objects
    (this avoids incurring runtime overhead - https://docs.oracle.com/javase/tutorial/java/generics/erasure.html)

    While my analysis from the last question was not completely incorrect, it omitted a very important part
    of setting up a new instance of BankAccount

     */

    /*
    Class baCls = BankAccount.class;
    try {
      BankAccount myAccount =  (BankAccount) baCls.newInstance();
      aStorage.setValue(myAccount);
      // Deposit
      myAccount.deposit(15);
    }
    catch ( InstantiationException e ) {
      // ...
    }
    catch ( IllegalAccessException e ) {
      // ...
    }



    4. What does the dynamic cast do here?
    Is it the compiler that performs the cast operation or the Java runtime environment (JVM)?
    Is this code safe?

    The dynamic cast ensures that the new myAccount variable is of class type BankAccount (and thus allows
    myAccount to access BankAccount methods)

    Since this is a dynamic cast it is performed by the JVM and not the compiler.


     */

    Class<BankAccount> baCls = BankAccount.class;
    try {
      BankAccount myAccount =  (BankAccount) baCls.newInstance();
      aStorage.setValue(myAccount);
      // Deposit
      myAccount.deposit(15);
    }
    catch ( InstantiationException e ) {
      // ...
    }
    catch ( IllegalAccessException e ) {
      // ...
    }
    /*
    5. Explain the compiler output?
    Are there errors?
    What is the reason?
    What does this say about the role of generics in our code?

    The new line change has now ensured that any object created as class type baCls
    will be an instance of BankAccount - thus casting it becomes redundant, and the next line
    can be removed

    For our code, generics allows us to reduce the redundancy of needing to dynamically cast every new class instance
     */

    System.out.println( aStorage.getValue().showBalance() );

    if( aStorage.getClass() == sStorage.getClass() ) {
      System.out.println( "EQUAL" );
    } else {
      System.out.println( "NOT EQUAL" );
    }

    /*
    6. What is the run-time output?
    Explain why you get such output and how does this relate to generics and their use with reflective instantiation of objects?


    115.0
    EQUAL

    115 is a result of set balance being called (sets to 100) and the deposition of 15.

    EQUAL (the more interesting of the two) states that aStorage and sStorage are of the same class type,
    despite having been instantiated with different parameters (one with BankAccount, one with String)

    This tells us that the parameter that a generic class is instantiated with does not affect its 'overall'
    classtype - thus reflective instantiation should use the same constructors for both aStorage and sStorage


     */


  }
  }

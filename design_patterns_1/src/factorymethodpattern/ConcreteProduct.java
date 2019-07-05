package factorymethodpattern;

//implements the product interface

public class ConcreteProduct implements Product {


    @Override
    public void speak() {
        System.out.println("This is the concrete product");
    }
}

package factorymethodpattern;

//Overrides the generating method for creating ConcreteProduct objects

public class ConcreteCreator extends Creator {

    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}

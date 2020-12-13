package productQuestion1;

//can be referred to as the factory - it creates the Product objects
//this declares the FactoryMethod - which returns a Product object

public abstract class Creator {
    public void anOperation() {
        Product product = factoryMethod();
    }

    protected abstract Product factoryMethod();
}

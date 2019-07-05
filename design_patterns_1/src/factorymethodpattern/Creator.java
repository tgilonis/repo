package factorymethodpattern;

//can be referred to as the factory - it creates the Product objects
//this declares the factorymethodpattern - which returns a Product object

public abstract class Creator {

    public void anOperation() {
        Product product = factoryMethod();
    }

    protected abstract Product factoryMethod();


}

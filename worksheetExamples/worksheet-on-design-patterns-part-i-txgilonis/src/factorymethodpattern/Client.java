package factorymethodpattern;



public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.anOperation();
        Product product = creator.factoryMethod();
        product.speak();
    }
}

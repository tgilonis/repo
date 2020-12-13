package decorator;

public class Meat extends PizzaDecorator {
  private String description = "Meat (14.25)";
  private double price = 14.25;
  private Pizza pizza;
  public Meat(Pizza pizza) {


    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", " + description;
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + price;
  }
}

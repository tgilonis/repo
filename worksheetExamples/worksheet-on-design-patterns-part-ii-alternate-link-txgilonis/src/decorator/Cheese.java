package decorator;

public class Cheese extends PizzaDecorator {
  private Pizza pizza;
  private String description = "Cheese (20.72)";
  private double price = 20.72;

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", " + description;
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + price;
  }

  public Cheese(Pizza pizza) {
    this.pizza = pizza;
  }
}

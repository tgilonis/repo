package decorator;

public class RomaTomatoes extends PizzaDecorator  {
  private String description = "Roma Tomatoes (5.20)";
  private double price = 5.20;
  private Pizza pizza;

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", " + description;
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + price;
  }

  public RomaTomatoes(Pizza pizza) {
    this.pizza = pizza;
  }
}

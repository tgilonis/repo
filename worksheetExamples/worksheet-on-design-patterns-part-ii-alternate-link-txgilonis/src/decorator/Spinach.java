package decorator;

public class Spinach extends PizzaDecorator  {
  private String description = "Spinach (7.92)";
  private double price = 7.92;
  private Pizza pizza;

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", " + description;
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + price;
  }

  public Spinach(Pizza pizza) {
    this.pizza = pizza;
  }
}

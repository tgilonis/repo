package decorator;

public class GreenOlives extends PizzaDecorator {
  private Pizza pizza;
  private String description = "Green Olives (5.47)";
  private double price = 5.47;

  public GreenOlives(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", "+ description;
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + price;
  }
}

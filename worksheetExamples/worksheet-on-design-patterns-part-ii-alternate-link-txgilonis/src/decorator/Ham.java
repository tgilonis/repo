package decorator;

public class Ham extends PizzaDecorator {
  private Pizza pizza;
  private String description = "Ham (18.12)";
  private double price = 18.12;
  public Ham (Pizza pizza) {

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

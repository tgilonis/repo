package bridgepattern;

public class BigWheel extends Car {

  private final Product product;

  private final String carType;
  public BigWheel(Product product, String carType) {
    super(product, carType);
    this.product = product;
    this.carType = carType;
  }

  @Override
  public void assemble() {
    System.out.printf("Assembling %s for %s\n", product.productName(), carType);
  }



  @Override
  public void produceProduct() {
    product.produce();
    System.out.printf("Modifying product %s according to %s\n", product.productName(), carType);
  }
}

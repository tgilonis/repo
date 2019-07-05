package builderpattern;

public class CarDirector {
  CarBuilder carBuilder;

  public CarDirector(CarBuilder carBuilder) {
    this.carBuilder = carBuilder;
  }

  /**
   * build function makes sure the carbuilder carries out each function available to build the specified car
   * (hides this process from main body)
   * @return
   */
  public Car build() {
    carBuilder.buildBodyStyle();
    carBuilder.buildPower();
    carBuilder.buildEngine();
    carBuilder.buildBreaks();
    carBuilder.buildSeats();
    carBuilder.buildWindows();
    carBuilder.buildFuelType();
    return this.carBuilder.getCar();
  }
}
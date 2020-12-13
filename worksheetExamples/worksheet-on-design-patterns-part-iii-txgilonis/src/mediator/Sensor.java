package mediator;

public class Sensor {
  public boolean checkTemperature(int temp) {
    System.out.printf("Temperature is set to %d C\n", temp);
    return true;
  }
}

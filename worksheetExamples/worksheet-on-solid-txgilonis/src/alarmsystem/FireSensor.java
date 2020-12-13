package alarmsystem;

//5% of the time it is called, it raises an alarm
//Drains 10% battery between each poll

public class FireSensor implements HazardSensor {

  private int battery = 100;

  @Override
  public boolean isTriggered() {
    if (battery > 9) {
      battery -= 10;
    } else battery = 0;
    return Math.random() <= 0.05;
  }

  @Override
  public String getLocation() {

    return "Unknown";
  }

  @Override
  public String getSensorType() {

    return "Fire Sensor";
  }
  @Override
  public String getSensorResponsibility() {
    return "Hazard";
  }

  @Override
  public double getBatteryPercentage() {

    return battery;
  }
}

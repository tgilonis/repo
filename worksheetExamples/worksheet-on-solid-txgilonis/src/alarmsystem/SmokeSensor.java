package alarmsystem;

//10% of the time it is called, it raises an alarm
//Drains 20% battery between each poll


public class SmokeSensor implements HazardSensor {

  private int battery = 100;

  @Override
  public boolean isTriggered() {
    if(battery > 19) {
      battery -= 20;
    } else battery = 0;
    return Math.random() <= 0.1;
  }

  @Override
  public String getLocation() {

    return "Unknown";
  }

  @Override
  public String getSensorType() {

    return "Smoke Sensor";
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

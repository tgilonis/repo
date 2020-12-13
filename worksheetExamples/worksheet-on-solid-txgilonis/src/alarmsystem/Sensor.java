package alarmsystem;

public interface Sensor {


  boolean isTriggered();

  String getLocation();

  String getSensorType();

  //added to distinguish security and hazard sensors
  String getSensorResponsibility();

  //double getBatteryPercentage();
  /*
  removed due to redundancy within security sensors
  */
}



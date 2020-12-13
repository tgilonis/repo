package alarmsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
  private static final String EXIT = "exit";
  private static final String POLL = "poll";

  public static void main(String[] args){

    ControlUnitFactory controlUnitFactory = ControlUnitFactory.getInstance();
    SensorFactory sensorFactory = SensorFactory.getInstance();

    AbstractControlUnit normalControlUnit = controlUnitFactory.getControlUnit();
    SecurityControlUnit scUnit = controlUnitFactory.getSecurityControlUnit();

    FireSensor fSense = sensorFactory.getFireSensor();
    SmokeSensor sSense = sensorFactory.getSmokeSensor();
    MotionSensor mSense1 = sensorFactory.getMotionSensor();
    MotionSensor mSense2 = sensorFactory.getMotionSensor();

    List<Sensor> sensors = new ArrayList<>();
    sensors.add(fSense);
    sensors.add(sSense);

    List<Sensor> sensors1 = new ArrayList<>();
    sensors1.add(mSense1);
    sensors1.add(mSense2);

    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals(EXIT)) {
      input = scanner.next();
      if(input.equals(POLL)) {
        normalControlUnit.pollSensors(sensors);
        scUnit.pollSensors(sensors1);
      }
    }
  }
}

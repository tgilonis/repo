package alarmsystem;

import java.util.List;

public abstract class AbstractControlUnit implements ControlUnit {

  //The construction of the sensors should happen outside of the ControlUnits

  @Override
  public void pollSensors(List<Sensor> sensors) {
    //can we use a lambda expression here/stream?
    for (Sensor sensor : sensors) {
      if (sensor.isTriggered()) {
        System.out.printf("A %s has been triggered at Location: %s\n", sensor.getSensorType(), sensor.getLocation());
      } else {
        System.out.printf("All clear at Location %s\n", sensor.getLocation());
      }

      }
    }
  }




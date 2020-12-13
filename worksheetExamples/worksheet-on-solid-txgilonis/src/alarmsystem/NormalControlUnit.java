package alarmsystem;

import java.util.List;

public class NormalControlUnit extends AbstractControlUnit {

    @Override
    public void pollSensors(List<Sensor> sensors) {
        for (Sensor sensor : sensors) System.out.println(((HazardSensor) sensor).getBatteryPercentage());
        super.pollSensors(sensors);
        }
    }



package alarmsystem;


import java.util.List;

public interface ControlUnit {

    void pollSensors(List<Sensor> sensors);

}

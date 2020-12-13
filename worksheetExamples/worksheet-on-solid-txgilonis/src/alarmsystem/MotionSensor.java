package alarmsystem;


public class MotionSensor implements Sensor {


    @Override
    public boolean isTriggered() {
        return false;
    }

    @Override
    public String getLocation() {
        return "Unknown";
    }

    @Override
    public String getSensorType() {
        return "Motion Sensor";
    }

    @Override
    public String getSensorResponsibility() {
        return "Security";
    }




}

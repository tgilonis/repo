package alarmsystem;

import java.util.Calendar;
import java.util.List;

public class SecurityControlUnit extends AbstractControlUnit {

    //extending a concrete class violates dependency inversion - should extend an abstract class
    @Override
    public void pollSensors(List<Sensor> sensors) {
        //time check goes here - between 2200 and 0600
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        if(hour > 21 || hour < 6) super.pollSensors(sensors);
    }
}

package alarmsystem;

public class SensorFactory {

    private static SensorFactory instance;
    private static FireSensor fSense;
    private static SmokeSensor sSense;
    private static MotionSensor mSense;

    static {
        instance = new SensorFactory();
    }

    private SensorFactory() {
        fSense = new FireSensor();
        sSense = new SmokeSensor();
        mSense = new MotionSensor();
    }

    public static SensorFactory getInstance() {return instance;}

    public FireSensor getFireSensor() { return fSense; }

    public SmokeSensor getSmokeSensor() { return sSense; }

    public MotionSensor getMotionSensor() { return mSense; }


    }



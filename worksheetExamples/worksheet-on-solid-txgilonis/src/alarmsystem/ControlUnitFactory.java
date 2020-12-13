package alarmsystem;

public class ControlUnitFactory {

    private static ControlUnitFactory instance;
    private static AbstractControlUnit cUnit;
    private static SecurityControlUnit scUnit;

    static {
        instance = new ControlUnitFactory();
    }

    private ControlUnitFactory() {
           cUnit = new NormalControlUnit();
           scUnit = new SecurityControlUnit();
    }

    public static ControlUnitFactory getInstance() {return instance;}

    public AbstractControlUnit getControlUnit() {return cUnit;}

    public SecurityControlUnit getSecurityControlUnit() {return scUnit;}

}

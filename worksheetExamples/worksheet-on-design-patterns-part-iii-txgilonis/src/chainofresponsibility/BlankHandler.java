package chainofresponsibility;


public abstract class BlankHandler implements Handler {
    protected String name;
    protected Handler nextHandler;
    protected String typeSupported;

    @Override
    public String getTypeSupported() {
        return typeSupported;
    }

    @Override
    public void setHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType() == getTypeSupported()) {
            System.out.printf("Processing and saving %s file... By %s\n", file.getFileType(), getHandlerName());
        } else {
            forwarding();
            nextHandler.process(file);
        }
    }

    @Override
    public String getHandlerName() {
        return name;
    }

    @Override
    public void forwarding() {
        System.out.printf("%s forwards request to %s\n", name, nextHandler.getHandlerName());
    }
}

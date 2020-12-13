package facadepattern;

public interface ScheduleServer {
  public void startBooting();

  public void readSystemConfigFile();

  public void init();

  public void initializeContext();

  public void initializeListeners();

  public void createSystemObjects();

  public void releaseProcesses();

  public void destroy();

  public void destroySystemObjects();

  public void destroyListeners();

  public void destroyContext();

  public void shutdown();
}

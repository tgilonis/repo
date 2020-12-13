package facadepattern;

public class ScheduleServerFacadeImpl implements ScheduleServerFacade {
  private ScheduleServer scheduleServer;
  public ScheduleServerFacadeImpl(ScheduleServer scheduleServer) {
    this.scheduleServer = scheduleServer;
  }

  @Override
  public void startServer() {
    scheduleServer.startBooting();
    scheduleServer.readSystemConfigFile();
    scheduleServer.init();
    scheduleServer.initializeContext();
    scheduleServer.initializeListeners();
    scheduleServer.createSystemObjects();
  }

  @Override
  public void stopServer() {
    scheduleServer.releaseProcesses();
    scheduleServer.destroy();
    scheduleServer.destroySystemObjects();
    scheduleServer.destroyListeners();
    scheduleServer.destroyContext();
    scheduleServer.shutdown();
  }
}

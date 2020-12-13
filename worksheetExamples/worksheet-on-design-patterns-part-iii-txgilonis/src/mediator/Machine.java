package mediator;

public class Machine {
  private MachineMediator mediator;
  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }

  public void start() {
      mediator.open();
  }
}

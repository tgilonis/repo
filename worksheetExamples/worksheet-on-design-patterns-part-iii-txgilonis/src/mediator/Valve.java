package mediator;

public class Valve {
  private MachineMediator mediator;
  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }
  public void open() {
    System.out.println("Valve is open...\nFilling water...");
    mediator.closed();
  }

  public void closed() {
    System.out.println("Valve is closed...");
    mediator.on();
  }

}

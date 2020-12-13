package mediator;

public class Heater {
  private MachineMediator mediator;

  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }

  public void on(int i) {
    System.out.printf("Heater is on...\nTemperature reached %d\n", i);
    if(mediator.checkTemperature(i)) mediator.off();
  }

  public void off() {
    System.out.println("Heater is off...");
    mediator.wash();
  }
}

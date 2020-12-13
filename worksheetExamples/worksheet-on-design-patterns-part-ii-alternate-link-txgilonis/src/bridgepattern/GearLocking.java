package bridgepattern;

public class GearLocking implements Product {
  private String gear_locking_system;
  public GearLocking(String gear_locking_system) {
    this.gear_locking_system = gear_locking_system;
  }

  @Override
  public String productName() {
    return gear_locking_system;
  }

  @Override
  public void produce() {
    System.out.println("Producing " + gear_locking_system);
  }
}

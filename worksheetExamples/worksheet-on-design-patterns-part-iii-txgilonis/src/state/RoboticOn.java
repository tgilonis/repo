package state;

public class RoboticOn implements RoboticState {
  private Robot robot;
  public RoboticOn(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void walk() {
    System.out.println("Walking...");
  }

  @Override
  public void cook() {
    robot.setRoboticState(robot.getRoboticCook());
    System.out.println("Cooking...");
  }

  @Override
  public void off() {
    robot.setRoboticState(robot.getRoboticOff());
    System.out.println("Robot is switched off");
  }
}

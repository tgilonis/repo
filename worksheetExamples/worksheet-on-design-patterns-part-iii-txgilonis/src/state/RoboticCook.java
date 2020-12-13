package state;

public class RoboticCook implements RoboticState {
  private Robot robot;
  public RoboticCook(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void walk() {
    robot.setRoboticState(robot.getRoboticOn());
    System.out.println("Walking...");

  }

  @Override
  public void cook() {
    System.out.println("Cooking..."); //already in cook state - no need to set state again
  }

  @Override
  public void off() {
    System.out.println("Cannot switch off at Cook state");

  }
}

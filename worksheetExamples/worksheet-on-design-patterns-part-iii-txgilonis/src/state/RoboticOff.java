package state;

public class RoboticOff implements RoboticState {
  private Robot robot;
  public RoboticOff(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void walk() {
    robot.setRoboticState(robot.getRoboticOn()); //turns robot back on
    System.out.println("Walking...");
  }

  @Override
  public void cook() {
    System.out.println("Cannot cook at Off state");

  }

  @Override
  public void off() {
    System.out.println("Robot is switched off.");
  }
}

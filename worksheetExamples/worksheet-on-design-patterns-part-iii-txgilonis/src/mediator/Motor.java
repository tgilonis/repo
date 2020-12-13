package mediator;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Motor {
  public void startMotor() {
    System.out.println("Start motor...");
  }


  public void rotateDrum(int i) {
    System.out.printf("Rotating drum at %d rpm\n", i);
  }
}

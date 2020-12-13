package prototypepattern;

public class AccessControl implements Prototype{
  private String access;

  private final String controlLevel;

  public AccessControl(String controlLevel,String access){

    this.access = access;
    this.controlLevel = controlLevel;
  }

  @Override
  public AccessControl clone(){
    try {
      return (AccessControl) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
  public String getControlLevel(){
    return controlLevel;
  }
  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }
}

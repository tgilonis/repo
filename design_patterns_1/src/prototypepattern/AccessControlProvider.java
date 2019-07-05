package prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

  private static Map<String, AccessControl> map = new HashMap<>();

  /**
   * static method to correctly initialize the accesscontrol hashmap each time an accesscontrolprovider is created
   */
  static {
    System.out.println("Fetching data from external resources and creating access control objects...");
    map.put("USER", new AccessControl("USER","DO_WORK"));
    map.put("ADMIN", new AccessControl("ADMIN","ADD/REMOVE USERS"));
    map.put("MANAGER", new AccessControl("MANAGER","GENERATE/READ REPORTS"));
    map.put("VP", new AccessControl("VP","MODIFY REPORTS"));
  }

  public static AccessControl getAccessControlObject(String controlLevel){
    AccessControl accessControl;
    accessControl = map.get(controlLevel);
    //as long as the map.get is fruitful(i.e.the correct term is used for the search), return accesscontrol

    if(accessControl != null){
      return accessControl;
    }
    return null;
  }

}

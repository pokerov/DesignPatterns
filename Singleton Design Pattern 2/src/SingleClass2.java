
/**
 * This is one of the first approaches to Singleton Design Pattern based on
 * Factory Design Pattern which returns the objects. Also it's not safe.
 * 
 * @author Kristiyan
 *
 */

public final class SingleClass2 {
  
  private static SingleClass2 instance = new SingleClass2();
  private String name;
  
  public static SingleClass2 getInstance() {
    return instance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

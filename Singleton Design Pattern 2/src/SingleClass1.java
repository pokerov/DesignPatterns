
/**
 * This approach was used before Java 1.5 but now is not so effective.
 * It's based on lazy initialization with direct access to the methods.
 * 
 * @author Kristiyan
 *
 */

public final class SingleClass1 {
  
  public static final SingleClass1 instance = new SingleClass1();
  private String name;
  
  private SingleClass1() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  

}

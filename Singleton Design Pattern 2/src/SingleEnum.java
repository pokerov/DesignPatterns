
/**
 * This approach of creating Singleton Design Pattern guarantees that
 * reflection skip modifying the "private" constructor to "public".
 * There is still a constructor but is empty, created by default by JVM.
 * 
 * @author Kristiyan
 *
 */

public enum SingleEnum {

  instance;
  
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

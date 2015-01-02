
/**
 * Main entry point
 * 
 * @author Kristiyan
 *
 */

public class Program {

  public static void main(String[] args) {
    
    // Enum Singleton
    SingleEnum.instance.setName("Mike");
    System.out.println(SingleEnum.instance.getName());
    
    // Static Singleton
    SingleClass1.instance.setName("John");
    System.out.println(SingleClass1.instance.getName());
    
    // Factory-based Singleton
    SingleClass2.getInstance().setName("Will");
    System.out.println(SingleClass2.getInstance().getName());
  }
}

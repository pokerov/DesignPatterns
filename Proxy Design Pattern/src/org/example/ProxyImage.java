package org.example;

/**
 * This is the key class which is used, as well as polymorphism
 * from Image to ProxyImage to create the object not exist and
 * delegating the execution to the concrete class.
 * 
 * @author Kristiyan
 *
 */

public class ProxyImage implements Image {

  private RealImage realImage;
  private String fileName;
  
  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }
  
  /**
   * Checks if there is already created such object and if not - 
   * creates a new instance and delegates through the interface.
   */

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(fileName);
    }
    realImage.display();
  }
  
  
}

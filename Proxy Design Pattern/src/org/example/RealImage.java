package org.example;

/**
 * The real object which holds implementation of the interface.
 * Also it stays hidden, since only the Proxy is used to access this one.
 * Code is delegated (forwarded) here, because this is the place which
 * provides real code.
 * 
 * @author Kristiyan
 *
 */

public class RealImage implements Image {

  private String fileName;
  
  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk(fileName);
  }
  
  private void loadFromDisk(String fileName) {
    System.out.println("Loading file from disk: " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying image: " + fileName);
  }
  
}

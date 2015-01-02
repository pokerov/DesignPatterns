package org.example;

import org.example.Image;
import org.example.ProxyImage;

/**
 * Proxy design pattern main entry point
 * 
 * @author Kristiyan
 *
 */

public class Program {
  
  public static void main(String[] args) {
    Image image = new ProxyImage("test_10mb.jpg");

    /*
     * Calls the display() method of ProxyImage type. Since there
     * is no existing object, this method will create new one and
     * delegate its execution through the Image interface.
     * It general will follow the chain ProxyImage -> Image -> RealImage
     * and will return back here to display the result of the method.
     */
    image.display();
  }

}

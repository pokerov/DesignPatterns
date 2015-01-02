package com.project;

import com.business.Messages;
import com.facades.ATMFacade;

/**
 * A rough example of Facades using programming to interface method.
 * This is also known as polymorphic type of conversion since Messages type
 * implements ATMFacade. Method implementations are placed (based on polymorphic call)
 * in the concrete class - Messages, but accessed from the facade. <br/><br/>
 * Consider Facade as a wall between business logic and some virtual methods, existing only in
 * abstract manner or interface (which is the same). Accessing is through the interface!
 * 
 * The idea of a Facade Design Pattern is to introduce a simple way of accessing
 * complex classes. This includes new names of methods which may be short and more
 * concise or clear. Also it's not required to be working with Interface - a class type
 * can also serve with same purpose.
 * 
 * Note: This is one of the various approaches to represent this pattern!
 * 
 * @author Kristiyan
 *
 */

public class Program {
  
  public static String showMethodResult(ATMFacade facade) {
    
    /*
     * If you keep passing the same object in multiple methods is good to have such
     * verification of the incoming argument, since you don't when it's gone wrong.
     * 
     *  This means if facade = null, throw NPE
     *  
     * In this case is not necessary.
     */
    assert facade != null : "Expecting concrete representation of facade";
    
    return facade.atmNotEnoughAmount(); // Invocation through Interface
  }
  
  public static void main(String[] args) {

    ATMFacade facade = new Messages();

    System.out.println(showMethodResult(facade));
    
  }
}

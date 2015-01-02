package com.business;

import com.facades.ATMFacade;

public final class Messages implements ATMFacade {

  public String atmNotWorkingMessage() {
    return "ATM is currently not working. Please excuse us.";
  }
  
  public String atmNotEnoughAmount() {
    return "You don't have enough amount.";
  }
}

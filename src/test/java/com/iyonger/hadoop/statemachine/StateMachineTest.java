package com.iyonger.hadoop.statemachine;

import org.junit.Test;

public class StateMachineTest {
  @Test
  public void testStateMachine(){
    AppImpl app=new AppImpl();
    AppEvent event1=new AppEvent(1,AppEventType.EVENT1);
    try {
      System.out.println("processing event for "+event1.getApplicationId()+" of " +
              "type"+event1.getType
              ());
      app.handle(event1);
    } catch (InvalidStateTransitionException e) {
      e.printStackTrace();
    }
  }
}

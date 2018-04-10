package com.iyonger.hadoop.statemachine;


public class AppImpl {
  private static final StateMachineFactory<AppImpl,AppState,AppEventType,
          AppEvent> stateMachineFactory=new StateMachineFactory<AppImpl,
          AppState,AppEventType,AppEvent>
          (AppState
          .STATE1).addTransition(AppState.STATE1,AppState.STATE2,AppEventType
          .EVENT1,new Event1Transition())
          .installTopology();

  private final StateMachine<AppState,AppEventType,AppEvent> stateMachine;

  public AppImpl(){
    this.stateMachine=stateMachineFactory.make(this);
  }

  public void handle(AppEvent event) throws InvalidStateTransitionException {
    this.stateMachine.doTransition(event.getType(),event);
  }

  private static class Event1Transition implements
          SingleArcTransition<AppImpl,AppEvent>{

    @Override
    public void transition(AppImpl app, AppEvent event) {
      System.out.println("do transition for "+event.getApplicationId()+" " +
              "of event type "+event
              .getType());
    }
  }

  /*public static void main(String[] args){
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
  }*/
}

package com.iyonger.hadoop.statemachine;

public interface StateTransitionListener  <OPERAND, EVENT, STATE extends Enum<STATE>>{
  /**
   * Pre Transition Hook. This will be called before transition.
   * @param op Operand.
   * @param beforeState State before transition.
   * @param eventToBeProcessed Incoming Event.
   */
  void preTransition(OPERAND op, STATE beforeState, EVENT eventToBeProcessed);

  /**
   * Post Transition Hook. This will be called after the transition.
   * @param op Operand.
   * @param beforeState State before transition.
   * @param afterState State after transition.
   * @param processedEvent Processed Event.
   */
  void postTransition(OPERAND op, STATE beforeState, STATE afterState,
                      EVENT processedEvent);
}

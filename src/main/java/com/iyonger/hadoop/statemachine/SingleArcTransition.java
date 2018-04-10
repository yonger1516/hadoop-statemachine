package com.iyonger.hadoop.statemachine;

public interface SingleArcTransition<OPERAND, EVENT> {
  public void transition(OPERAND operand, EVENT event);
}

package com.iyonger.hadoop.statemachine;

public interface MultipleArcTransition<OPERAND, EVENT, STATE extends Enum<STATE>>  {
  public STATE transition(OPERAND operand, EVENT event);
}

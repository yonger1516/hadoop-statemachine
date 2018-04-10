package com.iyonger.hadoop.statemachine;

public interface Event<TYPE extends Enum<TYPE>> {
  TYPE getType();
  long getTimestamp();
  String toString();
}

package com.iyonger.hadoop.statemachine;

public class AppEvent extends AbstractEvent<AppEventType>{
  private final long appId;
  private final String diagnosticMsg;
  public AppEvent(long appId,AppEventType type){
    this(appId,type,"");
  }

  public AppEvent(long appId,AppEventType appEventType,String diagnosticMsg) {
    super(appEventType);
    this.appId=appId;
    this.diagnosticMsg=diagnosticMsg;
  }

  public long getApplicationId(){
    return this.appId;
  }
  public String getDiagnosticMsg(){
    return this.diagnosticMsg;
  }

}

package challenges.flow;

import flow.ActionException;
import flow.EventException;
import flow.IEvent;

public class Message implements IEvent<String> {
  private String bodyMsg;
  Message(String bodyMsg) {
    this.bodyMsg = bodyMsg;
  }
  public String trigger() throws EventException, ActionException {
    return this.bodyMsg;
  }
}

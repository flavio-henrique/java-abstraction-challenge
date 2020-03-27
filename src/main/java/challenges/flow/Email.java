package challenges.flow;

import flow.ActionException;
import flow.IAction;

public class Email implements IAction<Message> {

  private String msg;

  Email(String msg) {
    this.msg = msg;
  }

  public Message execute() throws ActionException {
    return new Message("MSG:" + msg);
  }

  public String getType() {
    return "EMAIL";
  }
}

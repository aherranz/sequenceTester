package counter;

import es.upm.babel.sequenceTester.*;


public class Print extends CounterCall {
  private String msg;

  Print(String msg) {
    this.msg = msg;
  }

  public void toTry() {
    System.out.println(msg);
  }

  public String toString() {
    return "print(\""+msg+"\")";
  }
}

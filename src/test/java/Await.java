package counter;

import es.upm.babel.sequenceTester.*;


public class Await extends CounterCall {
  private int waitingFor;


  Await(int waitingFor) {
    setUser("await");
  }

  public void toTry() {
    controller.await(waitingFor);
  }

  public String toString() {
    return "await("+waitingFor+")";
  }
}

package counter;

import es.upm.babel.sequenceTester.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

  @Test
  public void test_01() {
    new UnitTest
      ("test_01",
       "",
       new Counter(),
       TestCall.unblocks(new Set(3)),
       TestCall.blocks(Call.returns("await",new Await(4))),
       TestCall.unblocks(Call.returns(new Dec(),2))).run();
  }

  @Test
  public void test_02() {
    new UnitTest
      ("test_02",
       "",
       new Counter(),
       TestCall.unblocks(new Set(3)),
       TestCall.blocks(Call.returns("whenEven",new WhenEven(),2)), 
       TestCall.unblocks(Call.returns(new Dec(),2),"whenEven")).run();
  }

  @Test
  public void test_03() {
    new UnitTest
      ("test_03",
       "",
       new Counter(),
       TestCall.unblocks(new Set(3)),
       TestCall.unblocks(Call.returns(new Dec(),2)),
       TestCall.unblocks(Call.raisesException(new AssertIsEqual(3),RuntimeException.class))
       ).run();
  }

  @BeforeEach
  public void setup() throws Exception {
    // UnitTest.installChecker(new RoboFabTestChecker());
    Call.reset();
  }
}


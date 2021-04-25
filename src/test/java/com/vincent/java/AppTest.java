package com.vincent.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.vincent.java.java8.Pizza;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
  /**
   * Rigorous Test.
   */
  @Test
  void testApp() {
    assertEquals(1, 1);
  }

  @Test
  public void givenPizaOrder_whenReady_thenDeliverable() {
      Pizza testPz = new Pizza();
      testPz.setStatus(Pizza.PizzaStatus.READY);
      assertTrue(testPz.isDeliverable());
}
}

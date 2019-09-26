package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void isPerfectSquare() {
    int input;
    boolean actual;
    input = 5;
    actual = Square.isPerfectSquare(input);
    assertFalse(actual);
    input = 4;
    actual = Square.isPerfectSquare(input);
    assertTrue(actual);
  }

  @Test
  void isPerfectSquareException() {
    try{
      Square.isPerfectSquare(-1);
      fail();
    } catch (IllegalArgumentException expected) {
      // Do nothing; this is exactly as expected
    }
  }
}




package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        Square.isPerfectSquare(-1);
      }
    });
  }

}




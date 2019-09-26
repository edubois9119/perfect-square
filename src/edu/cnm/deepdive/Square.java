package edu.cnm.deepdive;

public class Square {

  public static boolean isPerfectSquare(int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException();
    }
    int roundRoot = (int) Math.sqrt(value);
    return roundRoot * roundRoot == value;
  }

}

package de.lmbrs.pwn.facts;

import de.lmbrs.pwn.geometry.shape.Point;
import de.lmbrs.pwn.geometry.shape.Square;

import java.util.HashMap;
import java.util.Map;

public class Board {

  private final Map<String, Square> squares = new HashMap<>();

  /**
   * TODO.
   */
  public Board() {
    squares.put("a1", new Square(new Point(0, 0), 1));
    squares.put("a2", new Square(new Point(0, 1), 1));
    squares.put("a3", new Square(new Point(0, 2), 1));
  }

}

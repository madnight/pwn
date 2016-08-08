package pwn.geometry.point;

import java.math.BigDecimal;

public class Point1D implements Point {

  private final BigDecimal x;

  /**
   * A point in a 1-dimensional space.
   * 
   * @param x x-coordinate
   */
  public Point1D(final BigDecimal x) {
    this.x = x;
  }

  public BigDecimal getX() {
    return x;
  }

}

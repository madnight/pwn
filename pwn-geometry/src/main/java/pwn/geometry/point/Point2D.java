package pwn.geometry.point;

import java.math.BigDecimal;

public class Point2D implements Point {

  private final BigDecimal x;
  private final BigDecimal y;

  /**
   * A point in a 2-dimensional space.
   * 
   * @param x x-coordinate
   * @param y y-coordinate
   */
  public Point2D(final BigDecimal x, final BigDecimal y) {
    this.x = x;
    this.y = y;
  }

  public BigDecimal getX() {
    return x;
  }

  public BigDecimal getY() {
    return y;
  }

}

package pwn.geometry.point;

import java.math.BigDecimal;

public class Point3D implements Point {

  private final BigDecimal x;
  private final BigDecimal y;
  private final BigDecimal z;

  /**
   * A point in a 3-dimensional space.
   * 
   * @param x x-coordinate
   * @param y y-coordinate
   * @param z z-coordinate
   */
  public Point3D(final BigDecimal x, final BigDecimal y, final BigDecimal z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public BigDecimal getX() {
    return x;
  }

  public BigDecimal getY() {
    return y;
  }

  public BigDecimal getZ() {
    return z;
  }

}

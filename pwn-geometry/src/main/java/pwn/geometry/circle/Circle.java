package pwn.geometry.circle;

import pwn.geometry.point.Point;

import java.math.BigDecimal;

public abstract class Circle<P extends Point> {

  private final P center;
  private final BigDecimal radius;

  public Circle(final P center, final BigDecimal radius) {
    this.center = center;
    this.radius = radius;
  }

  public P getCenter() {
    return center;
  }

  public BigDecimal getRadius() {
    return radius;
  }

}

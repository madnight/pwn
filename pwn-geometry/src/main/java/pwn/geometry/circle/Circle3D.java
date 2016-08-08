package pwn.geometry.circle;

import pwn.geometry.point.Point3D;

import java.math.BigDecimal;

public class Circle3D extends Circle<Point3D> {

  public Circle3D(final Point3D center, final BigDecimal radius) {
    super(center, radius);
  }

}

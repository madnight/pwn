package de.lmbrs.pwn.core.qsr.shape;

public class Circle {

  private final Point center;
  private final double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public Point getCenter() {
    return center;
  }

  public double getRadius() {
    return radius;
  }

}

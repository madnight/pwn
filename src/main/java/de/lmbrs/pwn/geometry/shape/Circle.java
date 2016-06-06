package de.lmbrs.pwn.geometry.shape;

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

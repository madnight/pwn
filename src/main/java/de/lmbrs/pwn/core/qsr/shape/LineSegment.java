package de.lmbrs.pwn.core.qsr.shape;

public class LineSegment {

  private final Point pointA;
  private final Point pointB;

  public LineSegment(Point pointA, Point pointB) {
    this.pointA = pointA;
    this.pointB = pointB;
  }

  public Point getA() {
    return pointA;
  }

  public Point getB() {
    return pointB;
  }

}

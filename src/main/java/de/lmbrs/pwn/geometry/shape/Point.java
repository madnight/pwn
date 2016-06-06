package de.lmbrs.pwn.geometry.shape;

public class Point {

  private final double coordinateX;
  private final double coordinateY;

  public Point(double coordinateX, double coordinateY) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
  }

  public double getX() {
    return coordinateX;
  }

  public double getY() {
    return coordinateY;
  }

}

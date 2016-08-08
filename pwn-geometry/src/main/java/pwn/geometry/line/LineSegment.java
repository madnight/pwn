package pwn.geometry.line;

import pwn.geometry.point.Point;

public abstract class LineSegment<P extends Point> {

  private final P a;
  private final P b;

  public LineSegment(final P a, final P b) {
    this.a = a;
    this.b = b;
  }

  public P getA() {
    return a;
  }

  public P getB() {
    return b;
  }

}

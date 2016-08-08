package pwn.geometry.square;

import pwn.geometry.point.Point;

import java.math.BigDecimal;

// TODO https://docs.oracle.com/javase/8/docs/api/java/awt/geom/package-frame.html
// TODO http://geom-java.sourceforge.net/api/index.html
// TODO http://www.vividsolutions.com/jts/javadoc/index.html
// TODO https://en.wikipedia.org/wiki/Infimum_and_supremum

public abstract class Square<P extends Point> {

  private final P position;

  // TODO not sufficient (e.g. rotation ...). maybe via rectangle/polygon
  private final BigDecimal length;

  public Square(final P position, final BigDecimal length) {
    this.position = position;
    this.length = length;
  }

  public BigDecimal getLength() {
    return length;
  }

  public P getPosition() {
    return position;
  }

  // TODO Point getCenter()

}

package pwn.core.reason.shape;

// TODO https://docs.oracle.com/javase/8/docs/api/java/awt/geom/package-frame.html
// TODO http://geom-java.sourceforge.net/api/index.html
// TODO http://www.vividsolutions.com/jts/javadoc/index.html
// TODO https://en.wikipedia.org/wiki/Infimum_and_supremum

public class Square {

  private final Point position;
  private final int length;

  public Square(Point position, int length) {
    this.position = position;
    this.length = length;
  }

  public Point getPosition() {
    return position;
  }

  public int getLength() {
    return length;
  }

  // TODO Point getCenter()

}

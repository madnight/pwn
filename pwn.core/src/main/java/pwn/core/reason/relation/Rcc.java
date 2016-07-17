package pwn.core.reason.relation;

import pwn.core.reason.shape.Square;

/**
 *
 *
 * <p>
 * <b>References:</b>
 * </p>
 * 
 * <p>
 * Randell, D. A., Cui, Z., & Cohn, A. G. (1992). <i>A spatial logic based on regions and
 * connection.</i> KR, 92, 165-176.
 * </p>
 */
public class Rcc {

  // private static final String DC = null;

  // TODO constraint stuff instead of boolean return
  /**
   * TODO.
   * 
   * @param objectA TODO.
   * @param objectB TODO.
   * @return TODO.
   */
  public boolean disconnected(Square objectA, Square objectB) {
    /*
     * final double aX = objectA.getPosition().getX(); final double aY =
     * objectA.getPosition().getY(); final double bX = objectB.getPosition().getX(); final double bY
     * = objectB.getPosition().getY();
     * 
     * 
     * final boolean cond1 = objectA.getLength() > 0 && objectA.getLength() > 0 &&
     * objectB.getLength() > 0 && objectB.getLength() > 0;
     * 
     * final boolean cond2a = aX + objectA.getLength() < bX; final boolean cond2b = aY +
     * objectA.getLength() < bY; final boolean cond2c = bX + objectB.getLength() < aX; final boolean
     * cond2d = bY + objectB.getLength() < aY;
     */

    return true; // TODO
  }

}

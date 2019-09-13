import puzzle.Pieces;

/** This class displays the assembled puzzle.
 *
 * @author {YOUR NAME HERE}
 */
public class DisplayPuzzle {
  /** The main entry point for DisplayPuzzle.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    System.out.println(Pieces.hat());
    System.out.println(Pieces.body());
    System.out.println(Pieces.tailAndLegs());
    System.out.println("");
    System.out.print(" THE GATOR WIZARD STRIKES BACK!");
  }
}
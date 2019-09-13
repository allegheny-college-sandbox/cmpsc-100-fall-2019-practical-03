import puzzle.Pieces;

/** This class displays the assembled puzzle.
 *
 * @author Douglas Luman
 */
public class DisplayPuzzle {
  /** The main entry point for DisplayPuzzle.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // These are string objects representing each puzzle piece.
    String hat = Pieces.hat();
    String body = Pieces.body();
    String tailAndLegs = Pieces.tailAndLegs();
    // These are the print statements that display the caption and puzzle pieces.
    System.out.println(hat);
    System.out.println(body);
    System.out.println(tailAndLegs);
    System.out.println();
    System.out.print("      THE GATOR WIZARD STRIKES BACK!      ");
  }
}
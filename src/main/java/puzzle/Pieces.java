package puzzle;

/** This class contains all of the puzzle pieces for the Gator Wizard puzzle.
 * @author Douglas Luman
 */
public class Pieces {

  /** Returns the Gator Wizard's sweet hat.
   *
   * 
   */
  public static String hat() {
    return String.join("\n",
      "                             ##/*###",
      "                            /((((/,//#.",
      "                             .%  %(,((.,% .",
      "                                  %/((///%#(%",
      "                               .%%*.(((//%(((/",
      "                               %###%%%%#(##(/",
      "                                .%%###%((((/,,");
  }
  
  /** Returns the Gator Wizard's body.
   *
   * 
   */
  public static String body() {
    return String.join("\n",
      "                #((((%((((%%%#((((((((((((((((%(((((.",
      "              (((%#((((%(((%%%%%%%%%%%%%%%%%%%.%%%,",
      "            (%((((((((((((((%#(#%%%//////.");
  }

  /** Returns the Gator Wizard's legs.
   *
   * 
   */
  public static String tailAndLegs() {
    return String.join("\n",
      "          /##(((#(##(******#(((##(/////##%#(",
      "       .#%((/%((%(#%(////((####/////* (#%%%%",
      "     (##((////%(#(##(////((%#(/////    *%%%%",
      "   /(((((//    #(((((((   (((((((      /##(#("); 
  }
  
  /** Entry point for the Pieces class.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    System.out.print("NO PEEKING!");
  }
}
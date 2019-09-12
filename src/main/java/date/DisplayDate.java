package practicals;

import java.util.Date;

/** This class displays the date to STDOUT.
 *
 * @author Douglas Luman
 */

public class DisplayDate{
  /** The main entry point for DisplayDate.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("Today's date is: " + date);
  }
}
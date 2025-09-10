/**
* Hello World with Style.
* This program prints "Hello, World!" to the console.
* But with a bunch of extra comments to satisfy the style checker.
*
* @author  Atri Sarker
* @version 1.0
* @since   2025-09-08
*/
public final class HelloWorldStyle {
  /**
   * Private constructor to satisfy style checker.
   * @exception IllegalStateException for the utility class.
   * @see IllegalStateException
   */
  private HelloWorldStyle() {
    // Prevents illegal states.
    throw new IllegalStateException("Utility class.");
  }

  /**
   * Entrypoint of the program.
   * @param args UNUSED.
   */
  public static void main(final String[] args) {
    System.out.println("Hello, World! [With Style]");
  }
}

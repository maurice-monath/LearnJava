package squareroot;

/**
 * Überprüft, ob die gegebene Basis die Quadratwurzel der angegebenen Zahl ist.
 */
public class SquareRoot {

  /**
   * Überprüft, ob die Quadratzahl der Basis gleich der gegebenen Zahl ist.
   *
   * @param base   Wurzel aus der Nummer.
   * @param number Nummer
   * @return true, wenn die Basis die Quadratwurzel der Nummer ist, sonst false.
   */
  public static boolean isSquareRoot(int base, long number) {
    return (long) base * base == number;
  }

  /**
   * Hauptmethode zum Testen der isSquareRoot-Methode.
   *
   * @param args nicht verwendet
   */
  public static void main(String[] args) {
    System.out.println(isSquareRoot(-5, 25));
  }
}

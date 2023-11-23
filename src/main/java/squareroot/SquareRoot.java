package squareroot;

/**
 * ture oder false berrechung ob bases die wurzel aus nummer ist.
 */
public class SquareRoot {

  /**
   * @param base   Wurzel aus nummer.
   * @param number Nummer
   * @return ture oder false
   */
  public static boolean isSquareRoot(int base, long number) {

    return ((long) base * base) == number;
  }

  /**
   * @param args not used
   */
  public static void main(String[] args) {
    
    System.out.println(isSquareRoot(5, 25));
  }
}

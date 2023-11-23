package squareroot;

public class SquareRoot {

  public static boolean isSquareRoot(int base, long number) {

    boolean result = (base * base) == number
                     ? true
                     : false;

    return result;
  }

  public static void main(String[] args) {
    int base = 5;
    long number = 25;
    System.out.println(isSquareRoot(base, number));
  }
}

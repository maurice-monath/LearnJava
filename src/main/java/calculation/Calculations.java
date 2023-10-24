package calculation;

/**
 * This Class is for calculate.
 */
public class Calculations {
  /**
   * This function is for calculate.
   */
  public static void main(String[] args) {
    /*
     * Von Fahrenheit nach Celsius umrechnen
     */
    System.out.println(((40 - 32) * 5 / 9));
    System.out.println(((41 - 32) * 5 / 9));
    /*
     * Uhrzeit von Minuten in Stunden:Minuten umrechnen
     * Die 100 werden hier benutzt um das foramt hmm zu bekomen da die stunden zweistellig und
     * die Minuten Zweistellig sind.
     */
    System.out.println(5 / 60 * 100 + 5 % 60);
    System.out.println(59 / 60 * 100 + 59 % 60);
    System.out.println(60 / 60 * 100 + 60 % 60);
    System.out.println(61 / 60 * 100 + 61 % 60);
    System.out.println(825 / 60 * 100 + 825 % 60);
  }
}


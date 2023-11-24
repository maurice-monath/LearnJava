package percentage;

/**
 * Klasse für prozentuale Erhöhungsberechnungen.
 */
public class PercentageIncrease {

  /**
   * Erhöht einen Betrag um einen bestimmten Prozentsatz und rundet das Ergebnis
   * auf n Nachkommastellen.
   *
   * @param amount        Der zu erhöhende Betrag.
   * @param percentage    Der Prozentsatz, um den der Betrag erhöht werden soll.
   * @param decimalPlaces Die Anzahl der Nachkommastellen, auf die das Ergebnis
   *                      gerundet werden soll.
   * @return Das Ergebnis der prozentualen Erhöhung, auf n Nachkommastellen gerundet.
   */
  public static double increase(double amount, int percentage, int decimalPlaces) {
    // Berechnung des erhöhten Betrags
    double result = amount * (1 + percentage / 100.0);

    // Rundung auf n Nachkommastellen ohne Math.round
    double factor = Math.pow(10, decimalPlaces);
    result = result * factor;
    result = (int) result;
    result = result / factor;

    return result;
  }

  /**
   * Hauptmethode zum Testen der PercentageIncrease-Klasse.
   *
   * @param args nicht verwendet
   */
  public static void main(String[] args) {
    System.out.println(increase(1024.0, 13, 1));
  }
}

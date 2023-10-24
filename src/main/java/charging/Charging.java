package charging;

/**
 * Mit dieser Klasse berechnet man die Stromkosten und den Gesamtumsatzt.
 */
public class Charging {
  /**
   * Diese Methode berechnet die Kosten die beim Laden des Elektroautos stenched.
   */
  public static void main(String[] args) {
    int costPerKwh = 50;
    int costPerMinute = 30;


    System.out.println(costPerKwh * 50 + costPerMinute * 60);
    System.out.println(costPerKwh * 70 + costPerMinute * 90);
    System.out.println(costPerKwh * 55 + costPerMinute * 70);
    System.out.println(
        (costPerKwh * 50 + costPerMinute * 60) + (50 * 70 + 30 * 90) + (50 * 55 + 30 * 70));
  }
}

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
    int costPerCharge;
    int completeCost = 0;

    costPerCharge = costPerKwh * 50 + costPerMinute * 60;
    System.out.println(costPerCharge);
    completeCost = completeCost + costPerCharge;
    costPerCharge = costPerKwh * 70 + costPerMinute * 90;
    System.out.println(costPerCharge);
    completeCost = completeCost + costPerCharge;
    costPerCharge = costPerKwh * 55 + costPerMinute * 70;
    System.out.println(costPerCharge);
    completeCost = completeCost + costPerCharge;
    System.out.println(completeCost);
  }
}

package electricitybill;

/**
 * This class calculates the electricity bill.
 */
public class ElectricityBill {

  /**
   * This function calculates the electricity bill.
   */
  public static void main(String[] args) {
    int annualConsumption = 3535; // Annual consumption in kWh
    float basicPrice1 = 17.07F; // Basic price1 in Euro
    float basicPrice2 = 19.53F; // Basic price2 in Euro
    float consumptionPrice1 = 33.26F; // Consumption price 1 in Cent
    float consumptionPrice2 = 30.17F; // Consumption price 2 in Cent
    float tariff1;
    float tariff2;
    float totalCost;
    //Rechne die Kosten für Tarif1 und Tarif2 aus.
    tariff1 = (annualConsumption * consumptionPrice1) / 100 + basicPrice1 * 12;
    tariff2 = (annualConsumption * consumptionPrice2) / 100 + basicPrice2 * 12;
    //Vergleich die Kosten für Tarif1 und Tarif2 und speichere das Ergebnis in totalCost.
    totalCost = tariff1 < tariff2
                ? tariff1
                : tariff2;
    // Runde totalCost auf zwei Nachkommastellen.
    totalCost = (int) ((totalCost * 100) + 0.5) / 100.0F;
    System.out.println(totalCost);
  }
}

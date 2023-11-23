package electricitybill;

/**
 * The ElectricityBill2 class calculates the electricity bill amount.
 */
public class ElectricityBill2 {

  /**
   * Calculates the electricity bill amount.
   *
   * @param yearlyConsumption The yearly electricity consumption in kWh.
   * @param monthlyTariff1    The monthly base price of Tariff 1 in Euro.
   * @param rateTariff1       The consumption rate per kWh of Tariff 1 in Cent.
   * @param monthlyTariff2    The monthly base price of Tariff 2 in Euro.
   * @param rateTariff2       The consumption rate per kWh of Tariff 2 in Cent.
   * @return The calculated electricity bill amount.
   */
  public static float invoiceAmount(int yearlyConsumption, float monthlyTariff1, float rateTariff1,
                                    float monthlyTariff2, float rateTariff2) {
    // Calculate total cost for Tariff 1
    float totalTariff1 = (yearlyConsumption * rateTariff1) / 100 + monthlyTariff1 * 12;

    // Calculate total cost for Tariff 2
    float totalTariff2 = (yearlyConsumption * rateTariff2) / 100 + monthlyTariff2 * 12;

    float cheapest = totalTariff1 < totalTariff2
                     ? totalTariff1
                     : totalTariff2;
    // Determine the minimum between total costs and round the result
    return (int) ((cheapest * 100) + 0.5f) / 100.0F;
  }

  /**
   * Main method for testing the ElectricityBill2 class.
   */
  public static void main(String[] args) {
    int yearlyConsumption = 3535;
    float monthlyTariff1 = 17.07f;
    float rateTariff1 = 33.26f;
    float monthlyTariff2 = 19.53f;
    float rateTariff2 = 30.17f;
    float result =
        (((invoiceAmount(yearlyConsumption, monthlyTariff1, rateTariff1, monthlyTariff2,
            rateTariff2))));

    System.out.println(result);
  }
}

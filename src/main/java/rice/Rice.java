package rice;

/**
 * Mit dieser Klasse berechnet man die Stromkosten und den Gesamtumsatz.
 */
public class Rice {
  /**
   * Diese Methode berechnet die Kosten, die beim Laden des Elektroautos entstehen.
   */
  public static void main(String[] args) {
    int reiskoernerAufErstemFeld = 3;
    int prozentualeErhoehung = 50;
    int gesamtanzahlReiskoerner = reiskoernerAufErstemFeld;

    System.out.println(gesamtanzahlReiskoerner);

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    reiskoernerAufErstemFeld += (reiskoernerAufErstemFeld * prozentualeErhoehung) / 100;
    System.out.println(reiskoernerAufErstemFeld);
    gesamtanzahlReiskoerner += reiskoernerAufErstemFeld;

    System.out.println(gesamtanzahlReiskoerner);

  }
}

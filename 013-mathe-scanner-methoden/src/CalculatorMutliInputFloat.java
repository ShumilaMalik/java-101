import java.util.Scanner;
/*******************************************************************************************

Eingabe kann als Kommazahl erfolgen, aber: die Schreibweise ist

- richtig: 2.5
- falsch: 2,5

es muss . statt , verwendet werden!
*******************************************************************************************/

public class CalculatorMutliInputFloat {
  public static void main(String[] args) {
    // scanner definieren
    Scanner scanner = new Scanner(System.in);

    int anzahlEingaben = 0;

    System.out.print("Bitte geben Sie die Anzahl der Zahlen ein: ");
    anzahlEingaben = scanner.nextInt();

    // array für die menge der eingabe zahlen
    float[] zahlen = new float[anzahlEingaben];

    // schleife über die menge der eingaben (variable siehe oben)
    for(int i=0; i<anzahlEingaben; i++){
      System.out.print("Bitte geben Sie die Zahl " + (1+i) +  "  ein: ");
      // eingaben speichen
      zahlen[i] = scanner.nextFloat();
    }

    // Eingabe des Benutzers holen
    System.out.println("Welche mathematische Operation soll ausgeführt werden?");
    System.out.println("1 - Addition");
    System.out.println("2 - Subtraktion");
    System.out.println("3 - Multiplikation");
    System.out.println("4 - Division");
    System.out.println("5 - Alle");
    System.out.print("Geben Sie die Zahl ein: ");

    int eingabeOperation = scanner.nextInt();

    // ggf. hier prüfen ob die eingabe zwischen 1 und 5 war, falls nicht erneut fragen mittels schleife

    switch(eingabeOperation){
      case 1:
        System.out.println("Ergebnis der Addition: " + add(zahlen));
        break;
      case 2:
        System.out.println("Ergebnis der Subtraktion: " + sub(zahlen));
        break;
      case 3:
        System.out.println("Ergebnis der Multiplikation: " + mul(zahlen));
        break;
      case 4:
        System.out.println("Ergebnis der Division: " + div(zahlen));
        break;
      case 5:
        System.out.println("Ergebnis der Addition: " + add(zahlen));
        System.out.println("Ergebnis der Subtraktion: " + sub(zahlen));
        System.out.println("Ergebnis der Multiplikation: " + mul(zahlen));
        System.out.println("Ergebnis der Division: " + div(zahlen));
        break;
      default:
        System.out.println("Dies ware keine gültige Option!");
    }
  }

  // Addition
  public static float add(float[] zahlen){
    float ergebnis = 0;

    for(int i = 0; i < zahlen.length; i++){
      ergebnis += zahlen[i];
    }

    return ergebnis;
  }

  // Subtraktion
  private static float sub(float[] zahlen){
    float ergebnis = zahlen[0]; // erster Wert wird als Ausgangswert genommen

    // schleife beginnt an der 2. Position, da der erste Wert bereits "verwendet" wurde
    for(int i = 1; i < zahlen.length; i++){
      ergebnis -= zahlen[i];
    }

    return ergebnis;
  }
  // Multiplikation
  private static float mul(float[] zahlen){
    float ergebnis = zahlen[0]; // erster Wert wird als Ausgangswert genommen

    // schleife beginnt an der 2. Position, da der erste Wert bereits "verwendet" wurde
    for(int i = 1; i < zahlen.length; i++){
      ergebnis *= zahlen[i];
    }

    return ergebnis;
  }

  // Divison
  private static float div(float[] zahlen){
    float ergebnis = zahlen[0]; // erster Wert wird als Ausgangswert genommen

    // schleife beginnt an der 2. Position, da der erste Wert bereits "verwendet" wurde
    for(int i = 1; i < zahlen.length; i++){
      ergebnis /= zahlen[i];
    }

    return ergebnis;
  }
}
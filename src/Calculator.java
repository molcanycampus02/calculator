public class Calculator {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        // Speichere das Ergebnis aus "add" in die Variable "addResult"
        int addResult = add(a, b);

        // Rufe Methode "printResult" auf und übergebe den Wert für "addResult"
        printResult(addResult);

        // Speichere das Ergebnis aus "subtract" in die Variable "subtractResult"
        int subtractResult = subtract(a, b);
        //printResult(subtractResult);

        // Speichere das Ergebnis aus "multiply" in die Variable "result"
        int result = multiply(a, b);
        printResult(result);

        // Gebe "result" einen neuen Wert, den Wert aus dem Ergebnis der Methode "divide"
        result = divide(a, b);
        printResult(result);

        // Rufe die Methode "modulo" auf und übergebe das Resultat direkt der Methode "printResult"
        printResult(modulo(a, b));
        printResult(subtractResult);
    }

    /**
     * Addiere die 2 gegebenen Werte
     * @param a Wert 1
     * @param b Wert 2
     * @return das Ergenis der Addition
     */
    public static int add(int a, int b) {
        int erg;
        erg = a +b;
        return erg;
        //return a + b;
    }

    /**
     * Subtrahiere "b" von "a"
     * @param a Wert 1
     * @param b Wert 2
     * @return Das Ergebnis der Subtraktion
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Mulitpliziere die 2 gegebenen Werte
     * @param a Wert 1
     * @param b Wert 2
     * @return Das Ergebnis der Multiplikation
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Dividiere 2 Werte
     * @param dividend Der Dividend
     * @param divisor Der Divisor
     * @return Das Ergebnis der Division
     */
    public static int divide(int dividend, int divisor) {
        // führe die Berechnung nur aus, wenn der divisor ungleich 0 ist
        if (divisor != 0) {
            return dividend / divisor;
        }
        // sonst liefere einfach 0 zurück
        return 0;
    }

    /**
     * Berechne den Restwert einer Division
     * @param a Der Wert
     * @param mod Der Divisor
     * @return Den Restwert der Division
     */
    public static int modulo(int a, int mod) {
        return a % mod;
    }

    /**
     * Schreibe den übergebenen Wert in die Konsole
     * @param result Der Wert, welcher in der Konsole ausgegeben werden soll
     */
    public static void printResult(int result) {
        System.out.println("The result is: " + result);
    }
}


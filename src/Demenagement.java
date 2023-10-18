// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Demenagement {
    public static void main(String[] args) {


        int totalCartons = 34;
        int camion = 9;
        int nombreV = 0;
        // Press Maj+F10 or click the green arrow button in the gutter to run the code.

       while( totalCartons > 9) {
                totalCartons = totalCartons - camion;
                nombreV++;
                System.out.println(" il nous reste " +  totalCartons);
                System.out.println(nombreV++);
            }
            if (totalCartons != 0) {

                System.out.println(" derniere tourné " + totalCartons);
                return;

            }
        }
    }

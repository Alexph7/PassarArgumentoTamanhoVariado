package argumentosvariadostest;

/**
 *
 * @author ph757
 */
public class ArgumentosVariadosTest {

    // calcula a média
    public static double average(double... numeros) {
        double total = 0;

        // calcula total utilizando a instrução for aprimorada
        for (double numero : numeros) {
            total += numero;
        }
        return total / numeros.length;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 12.3;
        double b = 15.2;
        double c = 11.3;
        double d = 85;

        System.out.printf("a = %.1f%nb = %.1f%nc = %.1f%nd = %.1f%n%n", a, b, c, d);
        System.out.printf("media de a e b é: %.2f%n", average(a, b));
        System.out.printf("media de a e b e c é: %.2f%n", average(a, b, c));
        System.out.printf("media de a e b, c e d é: %.2f%n", average(a, b), c, d);
    }

}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Height: ");
            vect[i] = sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        for (int i = 0; i < n; i++) sum += vect[i];

        System.out.printf("AVERAGE HEIGHT = %.2f\n", sum / n);
    }
}

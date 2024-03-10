import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double[] list;
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        int N = sc.nextInt();
        list = new double[N];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter a number: ");
            list[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println();
        
        System.out.print("Numbers: ");
        double soma = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.print(String.format("%.2f", list[i]) + " ");
            soma += list[i];
        }

        System.out.printf("\nSum: %.2f", soma);
        System.out.printf("\nArithmetic mean: %.2f\n", (soma/N));
    }
}
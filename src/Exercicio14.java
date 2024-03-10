import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio14 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qunatity: ");
        int N = sc.nextInt();
        Product[] prods = new Product[N];

        for (int i = 0; i < N; i++) {
            System.out.print("> Product " + (i + 1) + "\nName: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            prods[i] = new Product(name, price);
        }
        sc.close();

        double sum = 0;
        for (int i = 0; i < N; i++) sum += prods[i].price;

        System.out.printf("AVERAGE PRICE = %.2f\n", (sum / N));
    }
}

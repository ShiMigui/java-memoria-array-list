import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] numbers;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar: ");
        numbers = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Numero: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Numeros pares: ");
        int pares = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                pares++;
            }
        }
        System.out.println("\nQuantidade: " + pares);
    }
}

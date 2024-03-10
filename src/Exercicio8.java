import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] numbers;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        numbers = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        sc.close();

        float media = 0;
        int qt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                qt++;
                media += numbers[i];
            }
        }
        if (qt != 0) media /= qt;

        if (qt == 0) System.out.println("NENHUM NUMERO PAR");
        else System.out.println("MEDIA DOS PARES = " + media);
    }
}

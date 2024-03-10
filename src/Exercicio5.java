import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float[] numbers;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        numbers = new float[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextFloat();
        }
        sc.close();

        int pos = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= numbers[pos]) pos = i;
        }

        System.out.println("MAIOR VALOR: " + numbers[pos]);
        System.out.println("POSICAO DO MAIOR VALOR: " + pos);
    }
}

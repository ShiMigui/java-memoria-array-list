import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float[] numbers;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        numbers = new float[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextFloat();
        }

        sc.close();

        float media = 0;
        for (int i = 0; i < numbers.length; i++) media += numbers[i];
        media /= numbers.length;

        System.out.println("MEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < media) System.out.println(numbers[i]);
        }
    }
}

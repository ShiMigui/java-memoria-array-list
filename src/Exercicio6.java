import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] arrayA, arrayB;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor: ");
        int N = sc.nextInt();
        arrayA = new int[N];
        arrayB = new int[N];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print((i + 1) + "o numero: ");
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print((i + 1) + "o numero: ");
            arrayB[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i] + arrayB[i]);
        }
    }
}

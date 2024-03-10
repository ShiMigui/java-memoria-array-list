import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exercicio11 {
    public static void main(String[] args) {
        //#region Variables e configs
        Person[] persons;

        float menorAltura, maiorAltura, mediaAlturaHomens, mediaAlturaMulheres;
        int qtHomens, qtMulheres;
        menorAltura = maiorAltura = mediaAlturaHomens = mediaAlturaMulheres = 0;
        qtHomens = qtMulheres = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //#endregion

        System.out.print("Quantas pessoas serao digitadas? ");
        persons = new Person[sc.nextInt()];

        for (int i = 0; i < persons.length; i++) {
            System.out.println();
            System.out.println((i + 1) + "a pessoa");

            System.out.print("Altura: ");
            persons[i] = new Person(sc.nextFloat());
            do {
                System.out.print("Genero: (M/F) ");
            } while (!persons[i].setGender(sc.next().toUpperCase().charAt(0)));

            //#region Calculando alturas
            if (menorAltura == 0) menorAltura = persons[i].getHeight();
            else if (menorAltura > persons[i].getHeight()) menorAltura = persons[i].getHeight();

            if (maiorAltura == 0) maiorAltura = persons[i].getHeight();
            else if (maiorAltura < persons[i].getHeight()) maiorAltura = persons[i].getHeight();

            if (persons[i].getGender() == 'M') {
                mediaAlturaHomens += persons[i].getHeight();
                qtHomens++;
            } else {
                mediaAlturaMulheres += persons[i].getHeight();
                qtMulheres++;
            }
            //#endregion
        }
        mediaAlturaHomens /= qtHomens;
        mediaAlturaMulheres /= qtMulheres;

        sc.close();

        System.out.println("\nMenor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura + "\n");

        System.out.printf("Altura media masculina = %.2f\n", mediaAlturaHomens);
        System.out.println("Quantidade masculina = " + qtHomens);
        System.out.printf("Altura media feminina = %.2f\n", mediaAlturaMulheres);
        System.out.println("Quantidade feminina = " + qtMulheres);
    }
}

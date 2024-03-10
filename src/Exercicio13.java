import java.util.Scanner;

import entities.Student;

public class Exercicio13 {
    public static void main(String[] args) {
        Student[] rooms = new Student[10];
        short N;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("How many rooms will be rented? ");
            N = sc.nextShort();
            if (N <= 0 || N > 10) System.out.println("Valor inválido");
        } while (N <= 0 || N > 10);

        for (short i = 0; i < N; i++) {
            sc.nextLine();

            short cd;
            String name, email;

            System.out.println("\nRent #" + (i + 1));
            do{
                System.out.print("Name: ");
                name = sc.nextLine().trim();
            } while(name=="");

            do{
                System.out.print("Email: ");
                email = sc.nextLine().trim();
            } while(email=="");

            do {
                System.out.print("Room: ");
                cd = sc.nextShort();
            } while ((cd <= 0 || cd > 10) || (rooms[cd - 1] != null));

            rooms[cd - 1] = new Student(name, email);
        }
        sc.close();

        System.out.println("\nBusy rooms:");
        for (short i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) System.out.printf("%d - %s\n", i + 1, rooms[i]);
        }
    }
}

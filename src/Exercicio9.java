import java.util.Scanner;

import entities.Person;

public class Exercicio9 {
    public static void main(String[] args) {
        Person[] persons;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        persons = new Person[sc.nextInt()];

        for (int i = 0; i < persons.length; i++) {
            sc.nextLine();

            System.out.println("Dados da 1a pessoa");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            short age = sc.nextShort();

            persons[i] = new Person(name, age);
        }

        sc.close();

        int cd = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() >= persons[cd].getAge()) cd = i;
        }

        System.out.println("PESSOA MAIS VELHA: " + persons[cd].getName());
    }
}

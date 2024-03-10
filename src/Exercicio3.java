import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exercicio3 {
    public static void main(String[] args) {
        Person[] persons;
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        int N = sc.nextInt();
        persons = new Person[N];

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter a person data: ");
            
            persons[i] = new Person();
            sc.nextLine();
            System.out.print("Name: ");
            persons[i].setName(sc.nextLine());

            System.out.print("Height: ");
            persons[i].setHeight(sc.nextFloat());

            System.out.print("Age: ");
            persons[i].setAge(sc.nextShort());
        }
        sc.close();

        System.out.println();
        String nomes = "";
        int qtMenores = 0;
        float alturas = 0;

        for(int i = 0; i < persons.length; i++){
            if(persons[i].getAge() < 16){
                nomes += persons[i].getName() + "\n";
                qtMenores++;
            }
            alturas += persons[i].getHeight();
        }

        System.out.printf("Height: %.2f\n", (alturas/N));
        System.out.println("Under sixteen: " + qtMenores);
        System.out.println(nomes);
        
    }
}
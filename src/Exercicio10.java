import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio10 {
    public static void main(String[] args) {
        Student[] students;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        students = new Student[sc.nextInt()];

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "o aluno");
            sc.nextLine();

            String name;
            float[] grades = new float[2];

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Primeira nota: ");
            grades[0] = sc.nextFloat();
            System.out.print("Segunda nota: ");
            grades[1] = sc.nextFloat();

            students[i] = new Student(name, grades);
        }

        sc.close();

        System.out.println("Alunos aprovados");
        for(int i = 0; i < students.length; i++) {
            Student current = students[i];
            if(current.media() >= 6) System.out.println(current.getName() + " - " + current.media());
        }
    }
}

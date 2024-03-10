import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio15 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("\nEmployee #" + (i + 1));

            Integer id;
            String name;
            Double salary;

            do {
                System.out.print("ID: ");
                id = sc.nextInt();
            } while (id <= 0);
            sc.nextLine();
            do {
                System.out.print("Name: ");
                name = sc.nextLine().trim();
            } while (name == "");

            do {
                System.out.print("Salary: $ ");
                salary = sc.nextDouble();
            } while (salary <= 0);

            employees.add(new Employee(id, name, salary));
        }

        int id;
        Integer position;

        do {
            System.out.print("\nEmployee id: ");
            id = sc.nextInt();
            position = existsEmployee(employees, id);
        } while (id <= 0);

        if (position == null) System.out.println("Id does not exists!");
        else {
            Double percentage;
            do {
                System.out.print("Percentage: ");
                percentage = sc.nextDouble();
            } while (percentage <= 0);
            employees.get(position).increaseSalary(percentage);
        }

        System.out.println("\nList of Employees");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static Integer existsEmployee(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id)
                return i;
        }
        return null;
    }
}

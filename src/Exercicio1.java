import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] list;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        list = new int[sc.nextInt()];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter a number: ");
            list[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();

        for(int i = 0; i < list.length; i++){
            if(list[i] < 0) System.out.println("Number: " + list[i]);
        }
    }
}
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines, columns;

        do {
            System.out.print("Lines: ");
            lines = sc.nextInt();
        } while (lines < 0);

        do {
            System.out.print("Columns: ");
            columns = sc.nextInt();
        } while (columns < 0);

        int[][] numbers = new int[lines][columns];

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nNumber: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == n) {
                    System.out.printf("\nPosition: [%d, %d]%n", i, j);
                    
                    if (j - 1 >= 0) System.out.println("Left: " + numbers[i][j - 1]);
                    if (i - 1 >= 0) System.out.println("Top: " + numbers[i - 1][j]);
                    if (j + 1 < numbers[i].length) System.out.println("Right: " + numbers[i][j + 1]);
                    if (i + 1 < numbers.length) System.out.println("Bottom: " + numbers[i + 1][j]);
                }
            }
        }
    }
}

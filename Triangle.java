package ObjectOriented;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");

        int num_rows;
        num_rows = scanner.nextInt();

        for(int i =1; i<=num_rows; i++){
            for(int a =1; a<= i; a++){
                System.out.print(a);
            }
            System.out.println("");
        }

    }
}

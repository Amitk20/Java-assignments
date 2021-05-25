package ObjectOriented;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+ " * "+ i + " = " + num*i);
        }


    }
}

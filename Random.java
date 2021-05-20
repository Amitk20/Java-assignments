package ObjectOriented;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char userInput = scanner.next().charAt(0);

        switch (userInput){
            case 'r':
            case 'R':
                System.out.println("Found ");
                break;
            case 'a':
            case 'A':
                System.out.println("Found ");
                break;

            case 'n':
            case 'N':
                System.out.println("Found ");
                break;

            case 'd':
            case 'D':
                System.out.println("Found ");
                break;

            case 'o':
            case 'O':
                System.out.println("Found ");
                break;

            case 'm':
            case 'M':
                System.out.println("Found ");
                break;

            default:
                System.out.println("Not Found ");
        }
    }
}

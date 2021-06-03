package ObjectOriented;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string! :  ");


        String string = scanner.nextLine();
        string =string.replaceAll("\\s", "");
        System.out.println("Your string after removing the whitespaces! : " +string);

    }
}

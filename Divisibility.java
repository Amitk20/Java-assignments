package ObjectOriented;
//Task 2 Number1

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Consultadd JAVA Training");
        }else if(num % 3 == 0){
            System.out.println("Consultadd");
        }else if(num % 5 == 0){
            System.out.println("JAVA Training");
        }


    }
}

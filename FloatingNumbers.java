package ObjectOriented;

import java.util.Scanner;

public class FloatingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num = scanner.nextDouble();
        System.out.print("Enter the second number" );
        double num1 = scanner.nextDouble();
        scanner.close();

        if(Math.abs(num-num1)<=0.01){
            System.out.println("These are the same numbers.");
        }else{
            System.out.println("These are different numbers. ");
        }


    }
}

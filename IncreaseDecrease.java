package ObjectOriented;

import java.util.Scanner;

public class IncreaseDecrease {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First Number: ");
        double num = scanner.nextDouble();
        System.out.print("Enter your Second Number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter your Third Number: ");
        double num2 = scanner.nextDouble();

        if(num<num1&&num1<num2){
            System.out.println("Increasing ");
        }
        else if(num>num1&&num1>num2){
            System.out.println("Decreasing ");
        }
        else{
            System.out.println("Neither increasing or decreasing ");
        }
    }
}

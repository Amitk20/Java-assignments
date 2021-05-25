package ObjectOriented;

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Input: ");
        int num1= scanner.nextInt();

        System.out.print("Enter Second Input: ");
        int num2= scanner.nextInt();

        System.out.print("Enter Third Input: ");
        int num3= scanner.nextInt();

        System.out.print("Enter Fourth Input: ");
        int num4= scanner.nextInt();

        System.out.print("Enter Fifth Input: ");
        int num5= scanner.nextInt();

        System.out.print("Enter Sixth Input: ");
        int num6= scanner.nextInt();

        System.out.print("Enter Seventh Input: ");
        int num7= scanner.nextInt();

        System.out.print("Enter Eighth Input: ");
        int num8= scanner.nextInt();

        System.out.print("Enter Ninth Input: ");
        int num9= scanner.nextInt();

        System.out.print("Enter Tenth Input: ");
        int num10= scanner.nextInt();

        System.out.println("Sum of your input numbers are: " + (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10));
        System.out.println("Average of your input numbers are: " + (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10);


    }
}

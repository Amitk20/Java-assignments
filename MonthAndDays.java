package ObjectOriented;

import java.util.Scanner;

public class MonthAndDays {

    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 12 : ");
        month = scanner.nextInt();
        if(month == 1) {
            System.out.println("January 31 Days");
        }else if(month == 2){
            System.out.println("February 29 Days");
        }else if(month == 3){
            System.out.println("March 31 Days");
        }else if(month == 4){
            System.out.println("April 30 Days");
        }else if(month == 5){
            System.out.println("May 30 Days");
        }else if(month == 6){
            System.out.println("June 31 Days");
        }else if(month == 7){
            System.out.println("July 30 Days");
        }else if(month == 8){
            System.out.println("August 31 Days");
        }else if(month == 9){
            System.out.println("September 30 Days");
        }else if(month == 10){
            System.out.println("October 31 Days");
        }else if(month == 11){
            System.out.println("November 30 Days");
        }else if(month == 12){
            System.out.println("December 31 Days");
        }else{
            System.out.println("Invalid Details");
        }

    }
}

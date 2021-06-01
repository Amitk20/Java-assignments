package ObjectOriented;

import java.util.Scanner;

public class MonthAndYear {

    public static void main(String[] args) {
        int month;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Month Number : ");
        month = scanner.nextInt();
        System.out.print("Input a Year: ");
        year = scanner.nextInt();

        if(month == 1) {
            System.out.println("January " +year+ " has 31 Days");
        }else if(month == 2){
            System.out.println("February " +year+ " has 29 Days");
        }else if(month == 3){
            System.out.println("March " +year+ " has 31 Days");
        }else if(month == 4){
            System.out.println("April " +year+ " has 30 Days");
        }else if(month == 5){
            System.out.println("May " +year+ " has 30 Days");
        }else if(month == 6){
            System.out.println("June " +year+ " has 31 Days");
        }else if(month == 7){
            System.out.println("July " +year+ " has 30 Days");
        }else if(month == 8){
            System.out.println("August " +year+ " has 31 Days");
        }else if(month == 9){
            System.out.println("September " +year+ " has 30 Days");
        }else if(month == 10){
            System.out.println("October " +year+ " has 31 Days");
        }else if(month == 11){
            System.out.println("November " +year+ " has 30 Days");
        }else if(month == 12){
            System.out.println("December " +year+ " has 31 Days");
        }else{
            System.out.println("please input a valid year number");
        }

    }
}

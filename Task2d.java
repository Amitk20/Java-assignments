package ObjectOriented;
//Task 2 number4

import java.util.Scanner;

public class Task2d {

    public static void main(String[] args) {
        System.out.println("Enter a Number: " );
        Scanner scanner = new Scanner(System.in);

        while(true){
            int num = scanner.nextInt();
            if(num > 0){
                System.out.println("Good going");
            }else if(num < 0){
                System.out.println("Its over");
                break;
            }
        }


    }
}

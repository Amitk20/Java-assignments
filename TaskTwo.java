package ObjectOriented;
//Task Two Number 6

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner =  new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 2 == 0){
            if(num >= 2 && num <= 5){
                System.out.println("OLD");
            }else if(num >= 6 && num <= 30){
                System.out.println("NEW");
            }else if(num > 30){
                System.out.println("OLD");
            }else{
                System.out.println("OLD");
            }
        }

    }
}

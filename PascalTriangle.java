package ObjectOriented;


import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int num = scanner.nextInt();

        int num_rows = num;
        int number =1;

        for(int i=0; i<num; i++){
            for(int a =1; a<=num_rows; a++){
                System.out.print(" ");
            }
            number =1;
            for(int b =0; b<=i; b++){
                System.out.print(number + " ");
                number = number* (i-b)/(b+1);
            }
            num_rows--;
            System.out.println();
        }



    }
}

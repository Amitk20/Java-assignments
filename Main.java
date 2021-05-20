package ObjectOriented;

public class Main {

    public static void main(String[] args) {

        int temp;// temporary variable as my third variable
        int a = 20;
        int b = 40;

        System.out.println("----Before switching the numbers----");
        System.out.println("a = 20");
        System.out.println("b = 40");

        //now switching the variables
        temp = a;
        a = b;
        b = temp;

        //now printing out the result
        System.out.println("----After switching the numbers using third variable----");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //now switching without using third variable
        int c = 50;
        int d = 100;

        System.out.println("----Before switching the numbers----");
        System.out.println("c = 50");
        System.out.println("d = 100");

        c = c + d;
        d = c - d;
        c = c - d;

        //result after switching the numbers
        System.out.println("----After Switching without using third variable----");
        System.out.println("c = " +c);
        System.out.println("d = " +d);


    }
}

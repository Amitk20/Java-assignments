package ObjectOriented;


public class ExtraAssignment {

    public static void main(String[] args) {
        //Reversing a String
        String string = "ConsultAdd";
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();

        System.out.println("Given String is : " +string);
        System.out.println("Reverse string is : " +stringBuilder);

        String string1 = "consultadd";
        for (int i = 0, len = string1.length(); i < len; i++) {
            char character = string1.charAt(i);
            if (i % 2 == 0) {
                System.out.print(Character.toUpperCase(character));
            } else {
                System.out.print(Character.toLowerCase(character));
            }
        }
        
        System.out.println();


    }
}

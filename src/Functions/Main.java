package Functions;

import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // examplesMath();
        //examplesRandom();
        exampleString();
            }
        
            private static void exampleString() {
                var name = "Sergio Arturo Peña Chaparro";
                System.out.println(name.length());
                System.out.println(name.toUpperCase());
                System.out.println(name.toLowerCase());
                System.out.println(name.substring(0,8));
                System.out.printf("El caracter en la posición 5 es '%c'%n",name.charAt(5));

                var input = " dsdas asdasd232    ";
                System.out.println(input.trim());
                System.out.println(input.contains("as"));
                System.out.println(input.indexOf("as"));
                System.out.println(input.lastIndexOf("as"));

                var lastSpaceIndex = name.lastIndexOf(" ");
                System.out.println(name.substring(lastSpaceIndex+1));
            }
        
            private static void examplesRandom() {
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10)+1);
        }
        
    }

    private static void examplesMath() {
        System.out.println(Math.min(5, 7));
        System.out.println(Math.sqrt(125));
        System.out.println(Math.pow(2, 3));
    }
}

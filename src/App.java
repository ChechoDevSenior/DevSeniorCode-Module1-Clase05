import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        //pressEnter(scanner);
        showMenu(scanner);
        //System.out.println("Termino la aplicación.");
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("====================");
            System.out.println(" Menu Clase 05");
            System.out.println("--------------------");
            System.out.println("1. La prueba del ciclo While.");
            System.out.println("2. La prueba del ciclo Do Wwhile.");
            System.out.println("3. La prueba del ciclo For");
            System.out.println("0. Salir de la aplicación.");
            System.out.print("Ingresa su opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer = Gastar el enter
            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.err.println("Ingrese una opción valida.");
                    break;
            }
            if (option != 0) {
                pressEnter(scanner);
            }
        } while (option != 0);
    }

    private static void pressEnter(Scanner scanner){
        System.out.print("Presione ENTER para continuar.");
        scanner.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("You win!");
    }

    private static void doWhileTest() {
        var counter = 0;
        do {
            System.out.println(counter);
            // Avance
            counter--;
        } while (counter > 0);
        System.out.println("Boom!");
    }

    public static void whileTest() {
        var counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Assurance");
        System.out.println("Your passwords. Your privacy. Your control.");

        Scanner sc = new Scanner(System.in);

        // DECLARACION DE VARIABLES //

        boolean exit = false;
        int menuSelection;
        String service; 
        String username;
        String password;

        // MENU //

        while (!exit) {
            System.out.println("[1] Add a credential");
            System.out.println("[2] View saved accounts");
            System.out.println("[3] Search an account");
            System.out.println("[4] Delete a credential");
            System.out.println("[0] EXIT");
            System.out.print("SELECT AN OPTION: ");

            if (sc.hasNextInt()) {  // hasNextInt() --> COMPRUEBA SI EL SIGUIENTE DATO INTRODUCIDO ES UN NÚMERO ENTERO (int).
                                    // DEVUELVE true SI LO ES Y false SI NO LO ES.
                menuSelection = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("<ERROR> You must enter a number");
                sc.nextLine();
                continue;
            }

            /* nextInt() lee el número, pero deja pendiente el salto de línea que introduces al pulsar Enter.
            Por eso, el primer nextLine() no te permitirá escribir el servicio: leerá directamente ese salto de línea.
            */

            switch (menuSelection) {
                case 1:
                System.out.println("===== ADD A CREDENTIAL =====");
                System.out.println("Service: ");
                service = sc.nextLine();
                if (service.isBlank()) { // .isBlank() --> COMPROBAR SI UNA CADENA ESTA VACIA (APRENDIDO NUEVO)
                        System.out.println("<ERROR> Service cannot be empty");
                        break;
                }
                System.out.println("Username: ");
                username = sc.nextLine();
                if (username.isBlank()) {
                        System.out.println("<ERROR> Username cannot be empty");
                        break;
                }
                System.out.println("Password: ");
                password = sc.nextLine();
                if (password.isBlank()) {
                        System.out.println("<ERROR> Password cannot be empty");
                        break;
                    }
                System.out.println("Credential validated successfully");
                Credential account = new Credential(service, username, password);

                break;






                case 2:
                System.out.println();
                break;

                case 3:
                System.out.println();
                break;

                case 4:
                System.out.println();
                break;

                case 0:
                System.out.println();
                exit = true;
                break;

                default:
                    System.out.println("<ERROR> Not a valid number");
            }
        }
            sc.close();
    }
}

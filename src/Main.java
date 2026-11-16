import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Assurance");
        System.out.println("Your passwords. Your privacy. Your control.");

        Scanner sc = new Scanner(System.in);

        // DECLARACION DE VARIABLES //

        boolean exit = false;
        int menuSelection;


        // MENU //

        while (!exit) {
            System.out.println("[1] Add a credential");
            System.out.println("[2] View saved accounts");
            System.out.println("[3] Search an account");
            System.out.println("[4] Delete a credential");
            System.out.println("[0] EXIT");
            System.out.print("SELECT AN OPTION: ");
            menuSelection = sc.nextInt();


            switch (menuSelection) {
                case 1:
                System.out.println();
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

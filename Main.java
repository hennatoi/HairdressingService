import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

// First, the program asks the user what service he/she wants to select and prints the menu.
// The user can select either 1, 2, 3, 4, 5 or 0.

    public static void main(String[]args){

        int choice = 0;

        do{
            printMenu();
            choice = readInt();

            switch(choice){
                case 1:
                    HairdressingService haircut = new Haircut();
                    System.out.println(haircut.haircut());

                    break;
                
                case 2:
                    HairdressingService eyelashcare = new EyelashCare();
                    System.out.println(eyelashcare.eyelashcare());


                    break;

                case 3:
                    HairdressingService nailcare = new NailCare();
                    System.out.println(nailcare.nailcare());

                    break;

                case 4:
                    HairdressingService hairAndEyelash = new EyelashDecorator(new Haircut());
                    System.out.println(hairAndEyelash.haircut());

                    break;

                case 5:
                    HairdressingService hairAndNail = new NailDecorator(new Haircut());
                    System.out.println(hairAndNail.haircut());

                    break;

                case 0:
                    System.out.println("Thank you and have a nice day!");

                    break;

            }
        } while (choice != 0);

    }
        public static void printMenu() {
            System.out.println("\nSelect the service you want > ");
            System.out.println("\n 1) Hair cut 45min.");
            System.out.println(" 2) Eyelash care");
            System.out.println(" 3) Nail care");
            System.out.println(" 4) Hair cut 45min and eyelash care");
            System.out.println(" 5) Hair cut 45min and nail care");
            System.out.println(" 0) Quit");
            System.out.println("\nYour choice > ");
        }

        public static int readInt() {
            Scanner sc = new Scanner(System.in);
            boolean ok = false;
            int digit = 0;
    
            do {
                try {
                    digit = sc.nextInt();
                    sc.nextLine();
                    ok = true;
                } catch (InputMismatchException ime) {
                    sc.nextLine();
                    System.out.print("Error, please try again!");
                }
            } while (!ok);
    
            return digit;
        }

    }
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char option;
        do {
            System.out.println("==============");
            System.out.println("| TO-DO LIST |");
            System.out.println("==============");
            
            System.out.print("Do you wish to input again? [Y/N]: ");
            option = input.next().charAt(0);
            System.out.println();
        } while(option == 'y' || option == 'Y');
    }
}

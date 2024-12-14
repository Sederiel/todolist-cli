import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char option;
        do {
            System.out.print("Do you wish to input again? [Y/N]: ");
            option = input.next().charAt(0);
        } while(option == 'y' || option == 'Y');
    }
}

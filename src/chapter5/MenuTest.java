package chapter5;
import java.io.IOException;

public class MenuTest {

    public static void main(String[] args) throws IOException {
        char choice;
        Menu menu = new Menu();

        do {
            System.out.println("Cпpaвкa по оператору:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for");
            System.out.println(" 0. Exit");
            System.out.println("Bыбepитe нужный пункт:");
            choice = (char) System.in.read();
        } while (choice < '0' || choice > '5');
        menu.informationMethod(choice);
    }
}

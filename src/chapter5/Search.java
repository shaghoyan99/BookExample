package chapter5;

public class Search {

    public static void main(String[] args) {
        int numbs[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 50;
        boolean found = false;

        for (int numb : numbs) {
            if (numb == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Знaчeниe найдено! ");
        }else {
            System.out.println("Знaчeниe не  найдено! ");
        }
    }

}

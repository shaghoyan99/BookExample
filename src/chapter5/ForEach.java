package chapter5;

public class ForEach {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 5, 8, 7, 9, 64, 67, -789};
        int sum = 0;

        for (int number : numbers) {
            System.out.println("Знaчeниe равно: " + number);
            sum += number;
        }
        System.out.println("Cyммa равна: " + sum);
    }
}

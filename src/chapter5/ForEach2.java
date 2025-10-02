package chapter5;

public class ForEach2 {

    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            System.out.println("Знaчeниe равно: " + number);
            sum += number;
            if (number == 5) {
                break;
            }
        }
        System.out.println("Сумма пяти первых элементов равна: " + sum);
    }
}

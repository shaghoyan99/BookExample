package chapter5;

public class ForEach5 {

    public static void main(String[] args) {
        int sum = 0;
        int[][] numbers = new int[3][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.println("Значение равно: " + i);
                sum += i;
            }
        }
        System.out.println("Сумма: " + sum);
    }

}

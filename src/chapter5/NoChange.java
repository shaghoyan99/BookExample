package chapter5;

import java.util.Arrays;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int num1 = 0;
        for (int num : nums) {
            System.out.print(num + " ");
            num1 = num * 10;
        }
        System.out.println();
        System.out.println(num1);
        System.out.println(Arrays.toString(nums));
    }
}

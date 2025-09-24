package chapter5;

import java.util.Scanner;

public class SampleSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք թվեր (1-10 սահմանում)");
            int i = scanner.nextInt();
            switch (i){
                case 0:
                    System.out.println("i равно нулю. ");
                    break;
                case 1:
                    System.out.println("i равно единице. ");
                    break;
                case 2:
                    System.out.println("i равно двум. ");
                    break;
                case 3:
                    System.out.println("i равно трем. ");
                    break;
                default:
                    System.out.println("i больше трех. ");
            }

    }
}

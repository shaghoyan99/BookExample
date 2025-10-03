package chapter7;

public class Overload {

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;
        int i = 88;

        od.test();
        od.test(1, 2);
//        result = od.test(125.35);
//        System.out.println("Результат вызова ob.test(125.35): " + result);
        od.test(i);
        od.test(123.2);


    }

}

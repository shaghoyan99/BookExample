package chapter7;

public class PassOb {

    public static void main(String[] args) {
        Test test1 = new Test(100, 22);
        Test test2 = new Test(100, 22);
        Test test3 = new Test(-1, -1);
        Test test4 = new Test();
        Test ob1 = new Test(5);
        Test ob2 = ob1.incrByTen();
        System.out.println(ob1.a + " " + ob1.b);
        System.out.println(ob2.a + " " + ob2.b);
        int a = 15;
        int b = 20;
        System.out.println("a и b до вызова: " + a + " " + b);
        test4.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
        test4.a = a;
        test4.b = b;
        test4.meth(test4);
        System.out.println("a и b в test4 после вызова метода: " + test4.a + " " + test4.b);

        System.out.println("test1 == test2: " + test1.equalsTo(test2));
        System.out.println("test1 == test3: " + test1.equalsTo(test3));


    }
}

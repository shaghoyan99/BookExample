package chapter7;

public class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test() {
    }

    Test(int i){
        a=i;
    }

    Test incrByTen(){
        Test test = new Test(a+10);
        return test;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    void meth(Test test) {
        test.a *= 2;
        test.b /= 2;
    }


    boolean equalsTo(Test test) {
        if (test.a == a && test.b == b) {
            return true;
        }
        return false;
    }

}

package chapter6;

public class BoxTest {

    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,30);
        Box myBox2 = new Box();
        Box myBox3 = new Box(10);
        Box myClone = new Box(myBox1);
        double vol;
//        myBox1.depth = 15;
//        myBox1.width = 10;
//        myBox1.height = 20;
//
//        myBox2.depth = 9;
//        myBox2.width = 3;
//        myBox2.height = 6;


//        vol = myBox1.depth * myBox1.height * myBox1.width;
//        System.out.println("Объем равен " + vol);
//        vol = myBox2.depth * myBox2.height * myBox2.width;
//        System.out.println("Объем равен " + vol);
//        myBox1.volume();
//        myBox2.volume();
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
//        myBox1.setDim(15, 25, 35);
        myBox2.setDim(45, 55, 65);
        System.out.println("Объем равен " + myBox1.volume());
        System.out.println("Объем равен " + myBox2.volume());
        System.out.println(myBox3.volume());
        System.out.println(myBox1.equalsTo(myClone));
        System.out.println(myBox1.equalsTo(myBox2));

    }
}

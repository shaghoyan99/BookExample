package chapter6;

public class Box {

    double width;
    double height;
    double depth;


    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

//    void volume() {
//        System.out.println("Объем равен ");
//        System.out.println(width * height * depth);
//    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    boolean equalsTo(Box box) {
        if (box.width == width && box.height == height && box.depth == depth) {
            return true;
        }
        return false;
    }

}

package chapter3;

public class Light {

    public static void main(String[] args) {

        int lightspeed = 186000; // приблизительная скорость света, миль в секунду
        long days = 1000; //указать количество дней
        long seconds;
        long distance;

        seconds = days * 24 * 60 * 60; // преобразовать в секунды

        distance = lightspeed * seconds; // вычислить расстояние

        System.out.print("Зa " + days + " дней свет пройдет около " + distance +" миль. ");

    }
}

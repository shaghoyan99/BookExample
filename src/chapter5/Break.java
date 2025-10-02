package chapter5;

public class Break {

    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            secound:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) {
                        break secound;
                    }
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}

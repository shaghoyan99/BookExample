package chapter5;

public class Menu {

    public void informationMethod(char choice) {
        switch (choice) {
            case '1':
                System.out.println("if: \n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switсh(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" / / ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор; ");
                break;
            case '0':
                System.out.println("Exit");
        }
    }


}

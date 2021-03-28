package Calculate;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int numFirst = getInt();
        int numSecond = getInt();
        char operation = getOperation();
        int result = calc(numFirst, numSecond, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вводить можно только числа!!!!!!!!!");
            scanner.next();
            num = getInt();
        }
        return  num;
    }

    public static char getOperation(){
        System.out.println("Введиде операцию: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вввод неправельный!!!!!!!!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int numFirst, int numSecond, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = numFirst + numSecond;
                break;
            case '-':
                result = numFirst - numSecond;
                break;
            case '*':
                result = numFirst * numSecond;
                break;
            case '/':
                result = numFirst / numSecond;
                break;
            default:
                System.out.println("Ввод был неверный, повторите ввод еще раз!!!");
                result = calc(numFirst, numSecond, getOperation());
        }
        return result;
    }

}

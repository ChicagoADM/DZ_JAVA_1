// Реализовать простой калькулятор

import java.util.Scanner;

public class Task_3 {
    static int scanNum() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    static String scanOperat() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNum();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperat();
        System.out.println("Введите второе число: ");
        int num2 = scanNum();
        int result = getResult(operations, num1, num2);
        System.out.printf("Результат: %d %s %d = %d", num1, operations, num2, result);

    }

    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Введите оператор: -, +, *, /");
        }
        return result;

    }
}

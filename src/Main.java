import java.util.Scanner;

public class Main {
    public static void printResult(int stringToPrint) {
        System.out.println("Ответ: " + stringToPrint);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstArgument;
        int secondArgument;
        String action;
        int result = -10000;
        System.out.println("Введите первое число");
        firstArgument = scanner.nextInt();
        System.out.println("Введите действие");
        action = scanner.next();
        System.out.println("Введите второе число");
        secondArgument = scanner.nextInt();

        if (action.equals("+")) {
            result = firstArgument + secondArgument;
        }
        else if (action.equals("-")) {
            result = firstArgument - secondArgument;
        }
        else if (action.equals("*")) {
            result = firstArgument * secondArgument;
        }
        else {
            System.out.println("Неверное действие");
        }
        if (result != -10000) {
            printResult(result);
        }
    }
}

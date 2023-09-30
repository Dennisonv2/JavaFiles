import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ввод первого числа
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();
        //Ввод второго числа
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();
        //Ввод оператора
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        //переменная, содержащая ответ
        double result = 0;

        //условный метод, выводящий нужную операцию
        switch (operator) { //начало метода
            case '+'://Что будет делаться если ввели "+"
                result = number1 + number2;
                break;
            case '-'://Что будет делаться если ввели "-"
                result = number1 - number2;
                break;
            case '*'://Что будет делаться если ввели "*"
                result = number1 * number2;
                break;
            case '/'://Что будет делаться если ввели "/"
                result = number1 / number2;
                break;
            default://Что будет делаться если ввели неверный оператор
                System.out.println("Некорректный оператор!");
                return;
        }
        //Вывод результата
        System.out.println("Результат: " + result);
    }
}
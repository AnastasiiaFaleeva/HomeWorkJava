import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = iScanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = iScanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operation = iScanner.next().charAt(0);
        iScanner.close();
        double result = 0.0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: некорректная операция!");
                return;
       
        }
                        
        System.out.println("Результат: " + result);
        
    }
}

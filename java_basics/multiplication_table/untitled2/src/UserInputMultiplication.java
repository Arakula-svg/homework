import java.util.Scanner;

public class UserInputMultiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для таблицы умножения: ");

        int number = scanner.nextInt();

        scanner.close();


        System.out.println("Таблица умножения для числа " + number + ":");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
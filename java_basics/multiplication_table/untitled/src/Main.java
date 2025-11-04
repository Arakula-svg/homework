public class Main {
    public static void main(String[] args) {
        // Выводим сообщение о том, что далее будет таблица
        System.out.println("Далее будет выведена таблица умножения на 2:");
        System.out.println(); // Пустая строка для красоты

        // Выводим таблицу умножения на 2 в столбик
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}
package work5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить запись");
            System.out.println("2. Поиск записей по имени");
            System.out.println("3. Выход");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.next();

                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.next();

                    // проверяем, есть ли уже запись с таким именем в телефонной книге
                    if (phoneBook.containsKey(name)) {
                        // если есть, добавляем номер телефона к существующей записи
                        phoneBook.get(name).add(phoneNumber);
                    } else {
                        // если нет, создаем новую запись с указанным номером телефона
                        ArrayList<String> numbers = new ArrayList<>();
                        numbers.add(phoneNumber);
                        phoneBook.put(name, numbers);
                    }

                    System.out.println("Запись успешно добавлена");
                    break;
                case 2:
                    System.out.print("Введите имя для поиска: ");
                    String searchName = scanner.next();

                    // проверяем, есть ли записи с указанным именем в телефонной книге
                    if (phoneBook.containsKey(searchName)) {
                        ArrayList<String> numbers = phoneBook.get(searchName);
                        System.out.println("Номера телефонов для " + searchName + ":");
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        System.out.println("Записи с именем " + searchName + " не найдены");
                    }
                    break;
                case 3:
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }

    // Метод поиска записей в телефонной книге
    public static ArrayList<String> searchRecords(String name, Map<String, ArrayList<String>> phoneBook) {
        ArrayList<String> records = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            if (key.contains(name)) {
                records.addAll(entry.getValue());
            }
        }
        return records;
    }
}

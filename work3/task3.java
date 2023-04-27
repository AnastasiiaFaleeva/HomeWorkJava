// Заполнить список названиями планет Солнечной системы в произвольном порядке
//  с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

package work3;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        // Создаем список планет
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");

        String[] names = new String[planets.size()];
        int[] counts = new int[planets.size()];

        int index = 0;

        for (String planet : planets) {
            if (contains(names, planet)) {
                counts[getIndex(names, planet)]++;
            } else {
                names[index] = planet;
                counts[index] = 1;
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(names[i] + ": " + counts[i]);
        }
    }

    private static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (value != null && value.equals(element)) {
                return true;
            }
        }
        return false;
    }

    private static int getIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (value != null && value.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
}


package work2;

public class task0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        countJewels(jewels, stones); // выводит "a3B1" в консоль
    }

    public static void countJewels(String jewels, String stones) {
        if (jewels == null || stones == null) {
            throw new IllegalArgumentException("Строки не могут быть null");
        }
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewel) {
                    count++;
                }
            }
            result.append(jewel).append(count);
            count = 0;
        }
        System.out.println(result.toString());
    }
}

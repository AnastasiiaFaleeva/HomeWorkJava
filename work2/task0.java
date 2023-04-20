public static void countJewels(String jewels, String stones) {
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

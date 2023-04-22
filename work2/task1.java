package work2;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1] result “abc”


public class task1 {

    public static void main(String[] args) {
        String str = "cba";
        int[] index = new int[] { 3, 2, 1 };
        char[] resultArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            resultArray[index[i] - 1] = str.toCharArray()[i]; 
        }
        str = "";
        for (char c : resultArray) {
            str += c;
        }
        System.out.println(str);
    }
}

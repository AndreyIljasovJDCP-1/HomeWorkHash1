import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris" +
                " nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in" +
                " reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla" +
                " pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
                " qui officia deserunt mollit anim id est laborum.";
        int min = Integer.MAX_VALUE;
        char cMin = '0';
        int max = -1;
        char cMax = '1';
        Map<Character, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("\\W", "");

        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : map.entrySet()) {
            int value= letter.getValue();
            char key= letter.getKey();

            if (value < min) {
                min = value;
                cMin = key;
            }

            if (value > max) {
                max = value;
                cMax = key;
            }
        }
        System.out.println("Анализ Lorem ipsum.");
        System.out.println("Максимальная частота у символа: " + cMax + " = " + max);
        System.out.println("Минимальная частота у символа: " + cMin + " = " + min);
    }
}
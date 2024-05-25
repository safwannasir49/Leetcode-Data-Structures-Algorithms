import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = romanMap.get(s.charAt(i));

            if (i + 1 < length) {
                int nextVal = romanMap.get(s.charAt(i + 1));
                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("IV"));     // Output: 4
        System.out.println(romanToInt("IX"));     // Output: 9
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV"));// Output: 1994
    }
}

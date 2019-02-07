package Countletters;

import java.util.HashMap;
import java.util.Map;


public class Countletters {
    public Map countLetters(String string) {
        string = string;
        char[] s = string.toCharArray();
        int count = 0;
        char ch = s[count];
        Map<Character, Integer> letters = new HashMap<>();
        for( int i = 0; i < s.length; i++ ) {
            ch = s[i];
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch) + 1);
            } else {
                letters.put(ch, 1);
            }
        }
        return letters;
    }
}
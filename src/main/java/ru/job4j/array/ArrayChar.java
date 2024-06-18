package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

package com.code;

/**
 * @author lin
 * @create 2024/6/3
 */
public class Identical {

    public static String removeDuplicateChars(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            if (i + 2 < length && currentChar == input.charAt(i + 1) && currentChar == input.charAt(i + 2)) {
                i=i+2;
                if (97 <= currentChar - 1 && currentChar - 1 <= 122) {
                    result.append((char)(currentChar-1));
                }
                continue;
            }
            result.append(currentChar);
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String input = "abcccbad";
        while (true){
            String tmp=input;
            input = removeDuplicateChars(input);
            if (tmp.equals(input)) {
                return;
            }
            System.out.println(input);
        }


    }
}


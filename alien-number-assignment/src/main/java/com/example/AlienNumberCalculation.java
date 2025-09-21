package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlienNumberCalculation {

    private static final Map<Character, Integer> values = new HashMap<>();

    static {
        values.put('A', 1);
        values.put('B', 5);
        values.put('Z', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('R', 1000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input your text: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty() || !input.matches("[ABZLCDR]+")) {
                System.out.println("Invalid input: Your text must contains [A,B,Z,L,C,D,R] Only");
                continue;
            }
            int result = convertAlienToInt(input);
            System.out.println("Result = " + result);

        }

    }

    public static int convertAlienToInt(String s) {
        int total = 0;
        int i = 0;

        while (i < s.length()) {
            int currVal = values.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextVal = values.get(s.charAt(i + 1));

                // Case subtraction (ABZ, ZLC, CDR)
                if (currVal < nextVal && isValidSubtraction(s.charAt(i), s.charAt(i + 1))) {
                    total += (nextVal - currVal);
                    i += 2;
                    continue;
                }
            }

            // Case normal
            total += currVal;
            i++;
        }
        return total;
    }

    public static boolean isValidSubtraction(char curr, char next) {
        return (curr == 'A' && (next == 'B' || next == 'Z')) ||
                (curr == 'Z' && (next == 'L' || next == 'C')) ||
                (curr == 'C' && (next == 'D' || next == 'R'));
    }

}

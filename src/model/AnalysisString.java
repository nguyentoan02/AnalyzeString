/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSII
 */
import java.util.*;

import java.util.stream.Collectors;

public class AnalysisString {
    //nhập số, sử dụng hashmap
    public HashMap<String, List<Integer>> getNumber(String input) {
        HashMap<String, List<Integer>> result = new HashMap<>();
        List<Integer> numbers = Arrays.stream(input.split("\\D+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        result.put("All Numbers", numbers);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        result.put("Even Numbers", evenNumbers);

        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        result.put("Odd Numbers", oddNumbers);

        List<Integer> squareNumbers = numbers.stream().filter(n -> Math.sqrt(n) == (int) Math.sqrt(n)).collect(Collectors.toList());
        result.put("Square Numbers", squareNumbers);

        return result;
    }

    public HashMap<String, StringBuilder> getCharacter(String input) {
        HashMap<String, StringBuilder> result = new HashMap<>();
        StringBuilder allChars = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();
        StringBuilder uppercaseChars = new StringBuilder();
        StringBuilder lowercaseChars = new StringBuilder();

        for (char c : input.toCharArray()) {
            allChars.append(c);
            if (Character.isUpperCase(c)) {
                uppercaseChars.append(c);
            } else if (Character.isLowerCase(c)) {
                lowercaseChars.append(c);
            } else if (!Character.isLetterOrDigit(c)) {
                specialChars.append(c);
            }
        }

        result.put("All Characters", allChars);
        result.put("Uppercase Characters", uppercaseChars);
        result.put("Lowercase Characters", lowercaseChars);
        result.put("Special Characters", specialChars);

        return result;
    }
}



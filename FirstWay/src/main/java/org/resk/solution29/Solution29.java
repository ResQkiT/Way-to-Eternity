package org.resk.solution29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution29{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> cityFamilyMap = new HashMap<>();

        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) {
                break;
            }

            String[] inputArr = input.split(" ");
            String city = inputArr[0];
            String family = inputArr[1];
            cityFamilyMap.put(city, family);
        }

        String targetCity = reader.readLine();

        if (cityFamilyMap.containsKey(targetCity)) {
            String familyName = cityFamilyMap.get(targetCity);
            System.out.println(familyName);
        }
    }
}
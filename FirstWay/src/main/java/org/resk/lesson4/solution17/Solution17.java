package org.resk.lesson4.solution17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Solution17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        Scanner  fileScanner;
        try (FileReader fileReader = new FileReader(fileName)) {
            fileScanner = new Scanner(fileReader);
            while (fileScanner.hasNext()){
                Integer i = fileScanner.nextInt();
                arrayList.add(i);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
        Collections.sort(arrayList);
        for (Integer i: arrayList
             ) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
package org.resk.lesson4.solution13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            String line;
            while (!(line = scanner.nextLine()).equals("exit")) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }

        scanner.close();
    }
}
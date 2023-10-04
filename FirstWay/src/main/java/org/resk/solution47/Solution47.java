package org.resk.solution47;
import java.io.*;
import java.nio.file.FileSystemException;

public class Solution47{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName;
        String destinationFileName;
        InputStream fileInputStream;
        while (true){
            sourceFileName = reader.readLine();
            try {
                fileInputStream = getInputStream(sourceFileName);
                break;
            }catch (IOException e){
                System.out.println("Файла не существует! введите его снова");
            }
        }
        OutputStream fileOutputStream;
        while (true){
            destinationFileName = reader.readLine();
            try {
                fileOutputStream = getOutputStream(destinationFileName);
                break;
            }catch (IOException e){
                System.out.println("Файла не существует! введите его снова");
            }
        }


        int count = 0;
        while (fileInputStream.available()>0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {

            return new FileInputStream(fileName);


    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
            return new FileOutputStream(fileName);
    }
}
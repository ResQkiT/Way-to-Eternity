package org.resk.first.solution37;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution37{
    public static void main(String[] args) throws Exception {
        try {
            method1();
        }catch (NullPointerException nullPointerException){
            System.out.println("Перехвачено: " + nullPointerException);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Перехвачено: " + fileNotFoundException);
        }
    }
    //Русская рулетка)))))
    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
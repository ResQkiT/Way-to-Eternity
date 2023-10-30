package org.resk.lesson4.solution25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution25{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String buf = sc.next();

        while (buf.equals("soapOpera") || buf.equals("cartoon") || buf.equals("thriller")){
            Movie movie = MovieFactory.getMovie(buf);
            System.out.println(movie.getClass().getSimpleName());
            buf = sc.next();
        }
    }
    // Написать тут ваши классы
    static class MovieFactory{

        static Movie getMovie(String key){
            Movie movie = null;
            if("soapOpera".equals(key)){
                movie = new SoapOpera();
            }else if("cartoon".equals(key)){
                movie = new Cartoon();
            }else if("thriller".equals(key)){
                movie = new Thriller();
            }
            return movie;


        }
    }
    static abstract class Movie{}
    static class SoapOpera extends Movie{}
    static class Cartoon extends Movie{}
    static class Thriller extends Movie{}
    static class GenreHeader{
        static ArrayList<String> data = new ArrayList<>();
        {
            String[] datas = {"soapOpera", "cartoon", "thriller"};
            Collections.addAll(data, datas);
        }
    }
}
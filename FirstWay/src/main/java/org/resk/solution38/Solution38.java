package org.resk.solution38;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Solution38{
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try{
            handleExceptions();
        }catch (Exception exception){
            BEAN.log(exception);
        }

    }

    public static void handleExceptions() throws FileSystemException {
        try{
            BEAN.methodThrowExceptions();
        }catch (FileSystemException fileSystemException){
            BEAN.log(fileSystemException);
            throw fileSystemException;
        }catch (IOException ioException){
            BEAN.log(ioException);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("Ошибка файловой системы");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
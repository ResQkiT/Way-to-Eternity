package org.resk.solution40;
public class Solution40{
    public static void main(String[] args) {
        handleExceptions(new Solution40());
    }

    public static void handleExceptions(Solution40 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException e) {
            printStack(e);

        }catch ( IndexOutOfBoundsException e){
            printStack(e);

        }catch (NumberFormatException e){
            printStack(e);
        }
        System.out.println( "END");
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() throws NullPointerException {
        throw new NullPointerException();
    }

    public void method2() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }

    public void method3() throws NumberFormatException{
        throw new NumberFormatException();
    }
}
package app;

public class Main {

    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);
        e = subtract(a, b);
        System.out.println(e);
        f = divide(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract (int a, int b) {
        return a - b;
    }

    private static int divide (int a, int b) {
        return a / b;
    }
}

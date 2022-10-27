// John Denver Balagwis
// BSIT- 3D
// OOP: Method overloading evaluation

public class methoddemo {

    public void sum(int a, int b) {
        int total = (a + b);
        System.out.println("\nThe total is: " + total);
    }

    public void sum(float x, int y) {
        float total = (x + y);
        System.out.println("The total is: " + total);
    }

    public int total(int a, int b) {
        return (a + b);
    }

    // Exaple of a method overloading
    public int total(int a, int b, int c) {
        return (a + b + c);
    }

    // create a method overloading in java using all the possible combinations of
    // byte, short, int, long, float, and double.

    // byte
    public byte sum(byte a, byte b) {
        return (byte) (a + b);
    }

    // short
    public short sum(short a, short b) {
        return (short) (a + b);
    }

    // long
    public long sum(long a, long b) {
        return (a + b);
    }

    // int
    public int add(int a, int b) {
        return (a + b);
    }

    // double
    public double sum(double a, double b) {
        return (a + b);
    }

    // float
    public float sum(float a, float b) {
        return (a + b);

    }

    // create a method overloading of combination of float and double
    public float sum(float a, double b) {
        return (float) (a + b);
    }

    public double sum(double a, float b) {
        return (a + b);
    }

    // create a method overloading of combination of int and double
    public int sum(int a, double b) {
        return (int) (a + b);
    }

    public double sum(double a, int b) {
        return (a + b);
    }

    // create a method overloading of combination of int and float
    public int sum(int a, float b) {
        return (int) (a + b);
    }

    public float total(float a, int b) {
        return (a + b);
    }

    // create a method overloading of combination of int and long
    public int sum(int a, long b) {
        return (int) (a + b);
    }

    public long sum(long a, int b) {
        return (a + b);
    }

    // create a method overloading of combination of int and short
    public int sum(int a, short b) {
        return (a + b);
    }

    public short sum(short a, int b) {
        return (short) (a + b);
    }

    // create a method overloading of combination of int and byte
    public int sum(int a, byte b) {
        return (a + b);
    }

    public byte sum(byte a, int b) {
        return (byte) (a + b);
    }

    // create a method overloading of combination of long and double
    public long sum(long a, double b) {
        return (long) (a + b);
    }

    public double sum(double a, long b) {
        return (a + b);
    }

    // create a method overloading of combination of long and float
    public long sum(long a, float b) {
        return (long) (a + b);
    }

    public float sum(float a, long b) {
        return (a + b);
    }

    // create a method overloading of combination of long and short
    public long sum(long a, short b) {
        return (a + b);
    }

    public short sum(short a, long b) {
        return (short) (a + b);
    }

    // create a method overloading of combination of long and byte
    public long sum(long a, byte b) {
        return (a + b);
    }

    public byte sum(byte a, long b) {
        return (byte) (a + b);
    }

    // create a method overloading of combination of short and double
    public short sum(short a, double b) {
        return (short) (a + b);
    }

    public double sum(double a, short b) {
        return (a + b);
    }

    // create a method overloading of combination of short and float
    public short sum(short a, float b) {
        return (short) (a + b);
    }

    public float sum(float a, short b) {
        return (a + b);
    }

    // create a method overloading of combination of short and byte
    public short sum(short a, byte b) {
        return (short) (a + b);
    }

    public byte sum(byte a, short b) {
        return (byte) (a + b);
    }

    // create a method overloading of combination of byte and double
    public byte sum(byte a, double b) {
        return (byte) (a + b);
    }

    public double sum(double a, byte b) {
        return (a + b);
    }

    // create a method overloading of combination of byte and float
    public byte sum(byte a, float b) {
        return (byte) (a + b);
    }

    public float sum(float a, byte b) {
        return (a + b);
    }

    // create a method overloading of combination of byte and long

    // main method
    public static void main(String[] args) throws Exception {

        methoddemo m;
        m = new methoddemo();

        m.sum(44, 40);
        m.sum(35.5F, 20);
        System.out.println("\nINHERITING METHOD\n");
        System.out.println("The result is: " + m.total(45, 50));
        m.total(45, 50);
        System.out.println("The sum of method  with three parameters is: " + m.total(45, 50, 55));
        System.out.println();
        System.out.println("The sum of 2 bytes is: " + m.sum((byte) 45, (byte) 50));
        System.out.println("The sum of 2 shorts is: " + m.sum((short) 45, (short) 50));
        System.out.println("The sum of 2 longs is: " + m.sum((long) 12121L, (long) 12121L));
        System.out.println("The sum of 2 ints is: " + m.add(45, 50));
        System.out.println("The sum of 2 doubles is: " + m.sum(45.50, 50.50));
        System.out.println("The sum of 2 floats is: " + m.sum(45.5F, 50.5F));
        System.out.println();
        System.out.println("The sum of float and double is: " + m.sum(45.5F, 50.50));
        System.out.println("The sum of double and float is: " + m.sum(45.50, 50.5F));
        System.out.println("The sum of int and double is: " + m.sum(45, 50.50));
        System.out.println("The sum of double and int is: " + m.sum(45.50, 50));
        System.out.println("The sum of int and float is: " + m.sum(45, 50.5F));
        System.out.println("The sum of float and int is: " + m.total(45.5F, 50));
        System.out.println("The sum of int and long is: " + m.sum(45, 50L));
        System.out.println("The sum of long and int is: " + m.sum(45L, 50));
        System.out.println("The sum of int and short is: " + m.sum(45, (short) 50));
        System.out.println("The sum of short and int is: " + m.sum((short) 45, 50));
        System.out.println("The sum of int and byte is: " + m.sum(45, (byte) 50));
        System.out.println("The sum of byte and int is: " + m.sum((byte) 45, 50));
        System.out.println("The sum of long and double is: " + m.sum(45L, 50.50));
        System.out.println("The sum of double and long is: " + m.sum(45.50, 50L));
        System.out.println("The sum of long and float is: " + m.sum(45L, 50.5F));
        System.out.println("The sum of float and long is: " + m.sum(45.5F, 50L));
        System.out.println("The sum of long and short is: " + m.sum(45L, (short) 50));
        System.out.println("The sum of short and long is: " + m.sum((short) 45, 50L));
        System.out.println("The sum of long and byte is: " + m.sum(45L, (byte) 50));
        System.out.println("The sum of byte and long is: " + m.sum((byte) 45, 50L));
        System.out.println("The sum of short and double is: " + m.sum((short) 45, 50.50));
        System.out.println("The sum of double and short is: " + m.sum(45.50, (short) 50));
        System.out.println("The sum of short and float is: " + m.sum((short) 45, 50.5F));
        System.out.println("The sum of float and short is: " + m.sum(45.5F, (short) 50));
        System.out.println("The sum of short and byte is: " + m.sum((short) 45, (byte) 50));
        System.out.println("The sum of byte and short is: " + m.sum((byte) 45, (short) 50));
        System.out.println("The sum of byte and double is: " + m.sum((byte) 45, 50.50));
        System.out.println("The sum of double and byte is: " + m.sum(45.50, (byte) 50));
        System.out.println("The sum of byte and float is: " + m.sum((byte) 45, 50.5F));
        System.out.println("The sum of float and byte is: " + m.sum(45.5F, (byte) 50));
        System.out.println();

    }

}

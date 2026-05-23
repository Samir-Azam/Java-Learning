class Variable {
    public static void main(String args[]) {

        // variable x: variables are used to store the data but only till the program is running. once the program is closed the data stored in the variable is lost.
        int x = 10;

        // Data types: 1. Primitive data types: byte, short, int, long, float, double, char, boolean
        // 2. Non-primitive data types: String, Arrays, Classes, Interfaces

        //Integer - size (4 bytes) - range (-2^31 to 2^31-1)
        int a = 10000;
        // Long - size (8 bytes) - range (-2^63 to 2^63-1)
        long b = 10000000000L; // L is used to indicate that the number is a long literal

        // short - size (2 bytes) - range (-2^15 to 2^15-1)
        short s = 1000;

        // byte - size (1 byte) - range (-128 to 127)
        byte by = 100;

        // char - size (2 bytes) - range (0 to 65535)
        char ch = 'a';

        // boolean - size (1 byte) - range (true or false)
        boolean bo = true;

        // float - size (4 bytes) - range (1.4E-45 to 3.4E+38)
        float d = 6.9f; // f is used to indicate that the number

        // double - size (8 bytes) - range (4.9E-324 to 1.7E+308)
        double c = 6.9; // double is used to store decimal numbers
    }
}

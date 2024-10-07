package khai.dict.com.lecture5;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        stringExamples();

        primitiveDataTypesExamples();

        charactersExample();

        castingExample();
    }

    public static void stringExamples() {
        System.out.println("Java");
        System.out.println(" 17, ");
        System.out.println();
        System.out.println("!");
        System.out.println(100);
        System.out.println(true);
        System.out.println(8.9);

        String str = "Java";
        int num = 1000;

        String dayOfWeek;
        dayOfWeek = "Monday";
        System.out.println(dayOfWeek);
        dayOfWeek = "Tuesday";
        System.out.println(dayOfWeek);
    }

    public static void primitiveDataTypesExamples() {
        var myVar = 100;

        byte myByte = -128;
        short myShort = 32000;
        int myInt = 32000000;
        long myLong = 1000_000_000_000L;

        float myFloat = 123.4f;
        double myDouble = 1000.0099;

        char myChar = '#';
        myInt = myChar;
        boolean myBool = true;

        System.out.println(myInt);
    }

    public static void charactersExample() {
        char lowerCase = 'a';
        char upperCase = 'A';
        int ascii1 = lowerCase;
        int ascii2 = upperCase;
        System.out.println(ascii1);
        System.out.println(ascii2);
    }

    public static void castingExample() {
        double someDouble = 2.7245645756568;
        long someLong = (long) someDouble;
        System.out.println(someLong);

        long bigLong = 1_000_000_000_000_000L;
        int someInt = (int) bigLong;
        System.out.println(someInt);

        someInt = 1000;
        bigLong = someInt;
        System.out.println(bigLong);
    }
}
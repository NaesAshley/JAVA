public class Main {
    /*
    * public - access modifier. public, protected, pivate, default
    * * static - static (look it up if you want to know more)
    * void - return type (you have to define a return type in java)
    * main - name of the method
     */

    // the main method is always going to be somewhere in a java app. and it's responsible for running the entire app
    public static void main(String[] args) {
        System.out.println("jenny fenny");
        /*
         * numerical types:
         * int - numbers
         * long - large numbers
         * short - small numbers
         * float - decimal numbers
         * double - decimal numbers: to the hundreth place (that means 2 decimal numbers). Example 2.22
         * bigint - large number
         */
        // type variableName = variable
        int number = 21;
        long longNumber = 1221313;
        double smallerDecimal = 2.22;
        /*
         * boolean - true | false
         *
         */
        boolean truth = true;
        boolean lie = false;

        /*
         * text
         * string - which is a regular string as you know it. an assortment of characters
         * Char - which is exactly one character. Inside of single quotes
         *
         */
        String name = "angel";
        char firstLetter = 'A';

        final String newName = "Don";
        // equivalent to "const" in JavaScript

        if (true) {
            System.out.println("naes");
        } else {
            System.out.println("not Naes");
        }
        // has == not ===
        if (name == "naes") {
            System.out.println("naes");
        } else {
            System.out.println("not Naes");
        }

        //
        if (name == "jacob") {
            System.out.println("this is jacob");
        } else if ((name == "jake")) {
            System.out.println("this is jake");
        } else {
            System.out.println("this is patrick");
        }

        /*
         * for (let i=9; i <28; i++){}
         *
         */
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        /* fizzbuzz
         * multiples of 3 - fizz
         * multiples of 5 - buzz
         * multiples of 15 - fizzbuzz
         */
        for (int i = 0; i <= 100; i++) {
            if (i == 0) {
                System.out.println(0);
            } else if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

            int idx = 0;
            while (idx < 100) {
                System.out.println(idx);
                idx++;
            }
            String [] names = {"Naes", "Jess", "thomas", "timmy"};
            for(int m = 0; m < names.length; m++) {
                System.out.println(names[m]);
            }
        }
        /*
         * above is important to run the program--- always need to mave the main method
         * in typescript a method looked like this
         * getName(name: paramType): returnType{} - example of typescript
         * main(args: String[]): void {}
         */

    }
}

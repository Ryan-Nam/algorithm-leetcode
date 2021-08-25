package CodingTest;

import java.util.Scanner;

public class test {


    public static String SimpleSymbols(String str) {
        String s1 = str.trim();
        String str1 = "";

        if (Character.isLetter(s1.charAt(0)) || Character.isLetter(s1.charAt(s1.length() - 1)))
            str1 = "false";


        for (int i = 1; i < str.length() - 1; i++)
            if (Character.isLetter(s1.charAt(i)) && (s1.charAt(i - 1) != '+' || s1.charAt(i + 1) != '+'))
                str1 = "true";

        return str1;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner sc = new Scanner(System.in);
        System.out.print(SimpleSymbols(sc.nextLine()));

        /*System.out.println("Hello");

        for (int i = 0; i <2; i++) {
            System.out.println("Enter a string: ");
            String s = sc.next();
            System.out.println(SimpleSymbols(s));
        }*/

    }
}

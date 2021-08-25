package CodingTest;

import java.util.Scanner;

/*
Have the function
take the str parameter being passed and determine if it is an acceptable sequence by either retruning the
string true or false

the str parameter will be composed of + and = symbols with several charater between them
and for the string to be true each letter must be surrounded by a + symbol.
So the string to the left would be false.
The string will not be empty and will have at least one letter


output will only show "true" or "false"
True condition: each letter must be surround by a "+"
 */
public class Simple_Symbols {
    static Scanner sc = new Scanner(System.in);

    public static boolean SimpleSymbols(String str){
        String s1=str.trim();

        if(Character.isLetter(s1.charAt(0)) || Character.isLetter(s1.charAt(s1.length()-1)))
            return false;


        for (int i = 1; i <str.length()-1; i++)
            if (Character.isLetter(s1.charAt(i)) && (s1.charAt(i - 1) != '+' || s1.charAt(i + 1) != '+'))
                return false;

        return true;
    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner sc = new Scanner(System.in);
        System.out.print(SimpleSymbols(sc.nextLine()));

        /*System.out.println("Hello");

        for (int i = 0; i <2; i++) {
            System.out.println("Enter a string: ");
            String s = sc.next();
            System.out.println(SimpleSymbols(s));
        }*/

    }
}

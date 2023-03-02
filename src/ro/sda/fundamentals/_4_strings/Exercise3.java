package ro.sda.fundamentals._4_strings;
// Write a Java program to convert all the characters in a string to lowercase and uppercase.
public class Exercise3 {
    public static void main(String[] args){
        String str = "Learning Java is Fun";
        System.out.println("Original string is " + str);

        String str2 = str.toUpperCase();
        System.out.println("Uppercase string is " + str2);

        String str3 = str.toLowerCase();
        System.out.println("Lowercase string is " + str3);

        System.out.println("Original string after methods called " + str);

        System.out.println("Lenght of the string is: " + str.length());
        System.out.println("Last index of the string is " + str.lastIndexOf("n"));
        System.out.println("First index of the string is " + str.indexOf("n"));


        System.out.println("String starts with Learn? - " + str.startsWith("Learn"));
        System.out.println("String starts with Java? - "  + str.startsWith("Java"));
        System.out.println("String ends with Fun? - " + str.endsWith("Fun"));
        System.out.println("String ends with Java? - " + str.endsWith("Java"));

    }
}

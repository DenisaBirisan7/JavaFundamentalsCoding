package ro.sda.fundamentals._4_strings;
// Write a Java program to concatenate a given string to the end of another string.
// Write a Java program to convert all the characters in a string to lowercase and uppercase.
public class Exercise2 {
    public static void main(String[] args){
        String str1 = "Java is";
        String str2 = " fun";

        str1+=str2;
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);
        str1+=str2;

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);

    }
}

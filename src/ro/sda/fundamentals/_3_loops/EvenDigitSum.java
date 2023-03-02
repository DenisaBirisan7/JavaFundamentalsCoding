package ro.sda.fundamentals._3_loops;

/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.

Example input/output:
*   getEvenDigitSum(123456789); -> should return 20 since 2 + 4 + 6 + 8 = 20
*   getEvenDigitSum(252); -> should return 4 since 2 + 2 = 4
*   getEvenDigitSum(252); -> should return -1 since the number is negative
*/
public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345));
        int result = getEvenDigitSum(-2);
        System.out.println(result);
    }

    /*
    number = 12345
    digit = 12345 % 10 = 5
    number = 12345 / 10 = 1234
    digit = 1234 % 10 = 4
    number = 1234 / 10 = 123
    .....
     */
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            number = number / 10;
        }
        return sum;
    }

}

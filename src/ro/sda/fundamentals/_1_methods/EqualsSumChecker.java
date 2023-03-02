package ro.sda.fundamentals._1_methods;

/*
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true or fasle
if the sum of the first and second parameter is equal to the third parameter.
Otherwise, return false.
Examples of input/output:
*   hasEqualSum(1, 1, 1); -> should return false since 1 + 1 is not equal to 1
*   hasEqualSum(1, 1, 2); -> should return true since 1 + 1 is equal to 2
*   hasEqualSum(1, -1, 0); -> should return true since 1 + (-1) is 1 - 1 and is equal to 0
*/
public class EqualsSumChecker {

    public static void main(String[] args) {

        boolean result1 = hasEqualSum(4, 5, 9);
        System.out.println(result1);
        System.out.println(hasEqualSum(7, 9, 12));
        System.out.println(hasEqualSum(12, 13, 25));

        int var1 = 100;
        int var2 = 200;
        int var3 = 500;

        boolean result2 = hasEqualSum(var1,var2,var3);
        System.out.println(result2);

    }

    public static boolean hasEqualSum(int a, int b, int result) {
        int sum = a + b;
        return sum == result;
    }
}

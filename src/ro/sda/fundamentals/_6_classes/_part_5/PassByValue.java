package ro.sda.fundamentals._6_classes._part_5;

public class PassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y =3;

        modify(x,y);

        System.out.println("Value of x after calling modify() is: " + x);
        System.out.println("Value of y after calling modify() is: " + y);
    }

    public static void modify(int a, int b) {
        a += 100;
        b += 2000;
    }
}

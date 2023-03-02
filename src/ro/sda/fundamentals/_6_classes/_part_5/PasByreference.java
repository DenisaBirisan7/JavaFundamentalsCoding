package ro.sda.fundamentals._6_classes._part_5;

public class PasByreference {

    public static void main(String[] args) {
        MyClass m1 = new MyClass(10);
        MyClass m2 = new MyClass(10);

        System.out.println("initial m1.x = " + m1.x);

        modify(m1);

        System.out.println("m1.x after calling modify() = " + m1.x);

    }

    public static void modify(MyClass a){
        a.x+=5000;
    }

}

class MyClass {
    int x;

    public MyClass(int x) {
        this.x = x;
    }

}


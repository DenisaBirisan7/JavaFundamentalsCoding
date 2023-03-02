package ro.sda.fundamentals._6_classes._part_4;

public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(12, 488);
        ComplexNumber c2 = new ComplexNumber(35.6,60.78);

        c1.add(75.3,1000.75);

        System.out.println("c1 real part is " + c1.getReal());
        System.out.println("c1 imaginary part is " + c1.getImaginary());

        c2.add(c1);
        System.out.println("c2 real part is: " + c2.getReal());
        System.out.println("c2 imaginary part is: " + c2.getImaginary());

        System.out.println("-------------------------------------");
        ComplexNumber c6 = new ComplexNumber(43.43,500.42);
        ComplexNumber c7 = new ComplexNumber(20.54, 200.35);

        c6.subtract(110.13, 300);
        c7.subtract(c6);

        System.out.println("c6 real part is: " + c6.getReal());
        System.out.println("c6 imaginary part is: " + c6.getImaginary());
        System.out.println("c7 real part is: " + c7.getReal());
        System.out.println("c7 imaginary part is: " + c7.getImaginary());

        ComplexNumber c8 = new ComplexNumber(20.54, 200.35);


    }
}

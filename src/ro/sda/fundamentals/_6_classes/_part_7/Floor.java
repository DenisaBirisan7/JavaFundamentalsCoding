package ro.sda.fundamentals._6_classes._part_7;

/*The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
        To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
        For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
        To cover the floor with a carpet that costs $8 per square meter would cost $960.
        1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
        The class needs to have one constructor with parameters width and height of type double, and it needs to initialize the fields.
        In case the width parameter is less than 0 it needs to set the width field value to 0,
        in case the length parameter is less than 0 it needs to set the length field value to 0.
        Write the following methods (instance methods):
        * Method named getArea without any parameters, it needs to return the calculated area (width * length).

 */
public class Floor {

    private double width;
    private double length;

    public Floor() {
        // using the bellow syntax, we call the constructor with parameters passing some default args
        this(1, 1);
        System.out.println("No-args constructor has been called!");
    }

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        System.out.println("Constructor with parameters has been called!");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
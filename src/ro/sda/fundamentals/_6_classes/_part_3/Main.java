package ro.sda.fundamentals._6_classes._part_3;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        //we created an instance of the class Wall (variable/reference wall1) - we used the constructor without params (no-args constructor)
        Wall wall1 = new Wall();

        //we called the setter for the width field on the instance that was previously created
        //using this setter, we will initialize the field/attribute/(instance/variable) - width - of the instance (wall1) with the value sent as a param
        wall1.setWidth(-100);

        //we called the setter for the height field on the instance that was previously created
        //using this setter, we will initialize the field/attribute/(instance/variable) - height - of the instance (wall1) with the value set as a param
        wall1.setHeight(50);

        // we retrieve the value of the instance variable - width - of the wall1 instance using the getter
        System.out.println("Width = " + wall1.getWidth());

        // we retrieve the value of the instance variable - height - of the wall1 instance using the getter
        System.out.println("Height = " + wall1.getHeight());

        // we call the - getArea() method - on the instance wall1
        System.out.println("Area = " + wall1.getArea());

        // we created another instance of the class Wall (variable/reference called wall2) - we used the constructor with params
        Wall wall2 = new Wall(72, 25);

        // we retrieve the value of the instance variable - width - of the wall2 instance using the getter
        System.out.println("width = " + wall2.getWidth());

        // we retrieve the value of the instance variable - height - of the wall2 instance using the getter
        System.out.println("height = " + wall2.getHeight());

        // we call the - getArea() method - on the instance wall2
        System.out.println("area = " + wall2.getArea());

    }
}

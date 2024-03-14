package baitap.docs.circlecyclinder;

public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(2.4, "blue");
        Cylinder cylinder = new Cylinder(5, "red", 4.4);
//        System.out.println("---------------CIRCLE----------------");
//        System.out.println(circle.getColor());
//        System.out.println(circle.getRadius());
//        System.out.println(circle.getArea());
//        System.out.println("---------------CYLINDER-----------------");
//        System.out.println(cylinder.getColor());
//        System.out.println(cylinder.getRadius());
//        System.out.println(cylinder.getHeight());
//        System.out.println(cylinder.getArea());
//        System.out.println("-------------------------------------");
//        System.out.println(circle);
//        System.out.println(cylinder);
        System.out.println("-------------------------------------");
        cylinder.setColor("yellow");
        System.out.println(circle.getColor());
        System.out.println(cylinder.getColor());
    }
}

package baitap.docs.triangle;

public class Main
{
    public static void main(String[] args)
    {
        Shape triangle1 = new Triangle("red", 3, 5, 2);
        Triangle triangle2 = new Triangle("blue", 4, 6, 8);
        System.out.println(triangle1.getColor());
        System.out.println(triangle2.getColor());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getArea());
        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}

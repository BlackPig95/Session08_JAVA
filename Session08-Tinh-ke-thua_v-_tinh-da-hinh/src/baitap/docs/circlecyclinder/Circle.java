package baitap.docs.circlecyclinder;

public class Circle
{
    private double radius;
    private String color;

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public Circle()
    {
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        System.out.println("Parent getColor is called");
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
        System.out.println("Parent setColor is called");
    }

    public double getArea()
    {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

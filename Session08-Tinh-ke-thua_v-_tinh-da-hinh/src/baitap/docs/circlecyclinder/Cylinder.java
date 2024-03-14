package baitap.docs.circlecyclinder;

public class Cylinder extends Circle
{
    private double height;

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height)
    {
        super(radius, color);
        this.setHeight(height);
    }

    public Cylinder()
    {
    }

    @Override
    public double getRadius()
    {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius)
    {
        super.setRadius(radius);
    }

    @Override
    public String getColor()
    {
        System.out.println("Child getColor is called");
        return super.getColor();
    }

    @Override
    public void setColor(String color)
    {
        super.setColor(color);
        System.out.println("Child setColor is called");
    }

    @Override
    public double getArea()
    {
        return super.getArea();
    }

    public double getVolume()
    {
        return this.getArea() * this.height;
    }

    @Override
    public String toString()
    {
        return "Cylinder{" +
                "height=" + this.getHeight() +
                ", radius=" + this.getRadius() +
                ", color'=" + this.getColor() + '\'' +
                ", volume=" + this.getVolume() +
                '}';
    }
}

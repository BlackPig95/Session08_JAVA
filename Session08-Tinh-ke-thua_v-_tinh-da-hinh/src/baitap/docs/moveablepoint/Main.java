package baitap.docs.moveablepoint;

public class Main
{
    public static void main(String[] args)
    {
        Point point = new Point(1, 2);
        MoveablePoint moveablePoint = new MoveablePoint(3, 3, 6, 7);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.Move().toString());
        System.out.println(moveablePoint);
    }
}

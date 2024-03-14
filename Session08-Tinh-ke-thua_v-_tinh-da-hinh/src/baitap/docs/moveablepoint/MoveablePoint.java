package baitap.docs.moveablepoint;

public class MoveablePoint extends Point
{
    private float xSpeed = 0.0f, ySpeed = 0.0f;

    public MoveablePoint()
    {
    }

    public MoveablePoint(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed)
    {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed()
    {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed)
    {
        this.xSpeed = xSpeed;
    }

    public float getySpeed()
    {
        return ySpeed;
    }

    public void setySpeed(float ySpeed)
    {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return "MoveablePoint " + "{x=" + this.getX() + " y=" + this.getY() +
                " Speed X=" + xSpeed +
                " Speed Y=" + ySpeed + "}";
    }

    public MoveablePoint Move()
    {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }
}

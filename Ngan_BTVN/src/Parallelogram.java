public class Parallelogram {
    public float x, y, h;

    public Parallelogram()
    {
    }

    public float perimeter()
    {
        return (x + y) * 2;
    }
    public float area()
    {
        return Math.max(x, y) * h;
    }

}

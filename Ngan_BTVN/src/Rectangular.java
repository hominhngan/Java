public class Rectangular {
    public float x, y, h;

    public Rectangular()
    {
    }
    public float perimeter()
    {
        return (x + y + h) * 4;
    }
    public float area()
    {
        return 2 * h * (x + y) + 2 * x * y;
    }
}
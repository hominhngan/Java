public class Rhombus {
    public float x, y;

    public Rhombus()
    {
    }

    public float perimeter()
    {
        return (float) (4 * Math.sqrt(x * x / 4 + y * y / 4));
    }
    public float area()
    {
        return  (x * y) / 2 ;
    }
}

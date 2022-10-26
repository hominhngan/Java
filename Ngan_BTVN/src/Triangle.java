public class Triangle {
    public float a, b, c;

    public Triangle()
    {
    }

    public boolean check()
    {
        return a + b > c && a + c > b && b + c > a;
    }

    public float perimeter()
    {
        return a + b + c;
    }
    public float area()
    {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


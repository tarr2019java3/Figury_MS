package pl.sda.figury;

public class Rectangle implements Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter(double a, double b) {
        return 2*a + 2*b;
    }

    @Override
    public double getArea(double a, double b) {
        return a*b;
    }
}

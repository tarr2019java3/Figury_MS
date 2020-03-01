package pl.sda.figury;

public class Triangle implements Figure{
private double sideA;
private double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter(double sideA, double sideB){
        return sideA + sideB + Math.sqrt(sideA*sideA + sideB*sideB);
    }

    @Override
    public double getArea(double sideA, double sideB){
        return sideA*sideB;
    }
}

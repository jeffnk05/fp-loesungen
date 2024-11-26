package io.fp.shapes;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    
}

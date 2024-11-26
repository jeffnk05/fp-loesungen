package io.fp.shapes;

public class Rectanglecircle implements Shape {

    private Circle c;
    private Rectangle r;

    public Rectanglecircle(double radius, double width, double length) throws SizeException{
        if (2 * radius > width || 2 * radius > length){
            throw new SizeException("Der Durchmesser darf nicht größer als die Seitenlängen sein!");
        } else {
            r = new Rectangle(length, width);
            c = new Circle(radius);
        }    
    
    }

    @Override
    public double area() {
        return r.area() - c.area();
    }

    @Override
    public double circumference() {
        return r.circumference() + c.circumference();
    }

    
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.shapes;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args){
        try {
        
            Shape form1 = new Rectangle(10, 20);
            Rectangle rectangle1 = new Rectangle(5, 15);
            Circle circle0 = new Circle(5);
            Circle circle1 = new Circle(10);
            Rectanglecircle recCec1 = new Rectanglecircle(5, 15, 20);
            //Rectanglecircle form = new Rectanglecircle(20, 5, 5);

            Shape[] shapeArray = {form1, circle1, circle0, rectangle1, recCec1};
        
            //System.out.println(form.circumference());
            System.out.println("Area: " + form1.area());
            System.out.println("Circumference: " + circle1.circumference());
            System.out.println("Accumalte Area: " + Util.accumulateArea(shapeArray));
            System.out.println("Accumalte Area: " + Util.accumulateArea(shapeArray));
        } catch (SizeException e) {
            System.out.println("There was a problem with the creation of the RectangleCircle");
        }
        
        
       
        }
    }

